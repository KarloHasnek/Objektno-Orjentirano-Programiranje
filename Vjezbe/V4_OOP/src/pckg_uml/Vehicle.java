package pckg_uml;

import java.util.concurrent.ThreadLocalRandom;

public class Vehicle {
    
    private String manufacturer;
    private String model;
    private int years;
    private int id;
    private static int cntID = 100;
    private String carPlate;
    private static final int MINYR = 1;
    private static final int MAXYR = 30;
    private static final String CP = "ZD - ";

    public Vehicle(String manufact, String model) {
        this.manufacturer = manufact;
        this.model = model;
        this.years = ThreadLocalRandom.current().nextInt(MINYR, MAXYR);
        this.id = cntID++;
        this.carPlate = "[" + CP + id + "]";
    }

    public String getCarPlate(){
        return carPlate;
    }

    public void driveVehicle() {
        System.out.println("Driving vehicle with car plate: " + carPlate);
    }

    @Override
    public String toString() {
        return "Vehicle [carPlate=" + carPlate + "]";
    }
}
