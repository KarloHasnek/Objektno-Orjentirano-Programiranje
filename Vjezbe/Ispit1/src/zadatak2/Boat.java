package zadatak2;

public class Boat extends Vehicle{

    private String boatName;

    public Boat(String boatName) {
        this.boatName = boatName;
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
        System.out.println("Moving " + direction + " at the speed of: " + speed);
    }

    @Override
    public String toString() {
        return "Boat{" + "boatName='" + boatName + ", id=" + id + '}';
    }
}
