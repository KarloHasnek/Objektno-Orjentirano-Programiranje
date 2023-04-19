package abs_cls;

public abstract class Device {
    
    protected String manufacturer;
    protected int id;
    protected static int cntID = 1;
    protected int batteryLevel;

    protected Device(String manufacturer){
        this.manufacturer = manufacturer;
        this.id = cntID++;
        this.batteryLevel = 0;
    }

    protected abstract void startDevice();
    protected abstract int chargeDevice();
    public void deviceInfo(){
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Battery level: " + batteryLevel);
        System.out.println("Device ID: " + id);
    }

}
