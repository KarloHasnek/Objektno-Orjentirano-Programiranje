public class Vehicle {
    
    protected int id;
    protected int cnt = 101;

    public void runEngine(){
        System.out.println("Running engine for the " + getClass().getSimpleName());
    }
    public void stopEngine(){
        System.out.println("Stopping engine for the " + getClass().getSimpleName());
    }
    public void getEnergy(){
        System.out.println("In the case of an electric" + getClass().getSimpleName() + "ensure battery power, otherwise, get the fuel!");
    }
    public void description(){
        System.out.println(this);
    }
    public void move(String s, double n){

    }


}
