package abs_cls;

public class MobilePhone extends Device{

    private int memory;
    private String cpu;

    protected MobilePhone(String manufacturer, String cpu, int mem) {
        super(manufacturer);
        this.cpu = cpu;
        this.memory = mem;
    }

    @Override
    protected void startDevice() {
        System.out.println(getClass().getSimpleName() + "power button on!");
    }

    @Override
    protected int chargeDevice() {
        if (batteryLevel < 20) {
            System.out.println("Charging to max...");
            batteryLevel = 100;
        } else {
            System.out.println("Enough battery for the rest of the day!");
        }
        return batteryLevel;
    }

    @Override
    public String toString() {
        return "MobilePhone [memory=" + memory + ", cpu=" + cpu + ", manufacturer=" + manufacturer + ", id=" + id + "]";
    }
    

    public void extendInternalMemory(int cap){
        System.out.println("Memory extended for -> " + cap);
    }
}
