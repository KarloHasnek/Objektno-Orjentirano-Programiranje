package zadatak3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Vehicle {
    
    //Atributi
    protected String brand;
    protected String model;
    protected String date;
    protected int vehID;
    private static int autoInc = 110;

    //Konstruktori
    public Vehicle(){
        this.vehID = autoInc++;
    }

    public Vehicle(String brand, String model){
        this.brand = brand;
        this.model = model;
        this.vehID = autoInc++;
    }
    
    //Setter
    public void setDate(String date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date2=new Date();
        try {
            date2 = dateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.date = dateFormat.format(date2); 
    }

    
    //Ostale Metode
    public void startVehicle(){
        //System.out.println("Vehicle is starting the engine...");
        System.out.println(getClass().getSimpleName() + "Strating engine...");
    }


    public void stopVehicle(){
        //System.out.println("Vehicle is stopped.");
        System.out.println(getClass().getSimpleName() + "is stopped.");
        System.out.println("Engine is turned off.");
    }


    // toString
    @Override
    public String toString() {
        return "Vehicle [brand=" + brand + ", model=" + model + ", date=" + date + ", vehID=" + vehID + "]";
    }

    
    protected void vehInfo(){
        //this ispisuje OVAJ OBJEKT tj. ispisuje toString() !!!
        //System.out.println(toString());
        System.out.println(this);
    }

}
