package zadatak3;

public class SportsCar extends Vehicle {

    //Konstruktor
    public SportsCar(String model, String brand, String date) {
        super(brand, model);
        setDate(date);
    }
    
    //Metode
    @Override
    public void startVehicle() {
        super.startVehicle();
        System.out.println("SportsCar is starting the engine!");
    }

    @Override
    public String toString() {
        return "SportsCar [brand=" + brand + ", model=" + model + ", date=" + date + ", vehID=" + vehID + "]";
    }
    
    
}
