package zadatak2;

public abstract class Vehicle {

    protected int id;
    protected static int cntID;

    public abstract void runEngine();
    public abstract void stopEngine();
    public abstract void getEnergy();
    public abstract void description();
    public abstract void move(String direction, double speed);
}
