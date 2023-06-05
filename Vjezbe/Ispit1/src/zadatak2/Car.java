package zadatak2;

public class Car extends Vehicle{

    private String model;

    public Car(String model) {
        this.model = model;
        this.id = cntID++;
    }

    @Override
    public void runEngine() {
        System.out.println("Running the engine....");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping the engine...");
    }

    @Override
    public void getEnergy() {
        System.out.println("In the case of an electric boat ensure battery power, otherwise, get the fuel!");
    }

    @Override
    public void description() {
        System.out.println(this);
    }

    @Override
    public void move(String direction, double speed) {

    }

    @Override
    public String toString() {
        return "Car{" + "model=" + model + ", id=" + id + '}';
    }
}
