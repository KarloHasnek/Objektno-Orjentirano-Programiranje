package pckg_polimorf;

public class Device {
    
    public Device(){
        System.out.println("Device object created");
    }

    public void powerOnDevice(int hrs) {
        System.out.println("Device is powered: " + hrs);
    }

    public void powerOnDevice(int hrs, String who) {
        System.out.println("Device is powered: " + hrs);
        System.out.println("Powered by: " + who);
    }
}
