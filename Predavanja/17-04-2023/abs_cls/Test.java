package abs_cls;

public class Test {
    
    public static void main(String[] args) {
        MobilePhone mp = new MobilePhone("Sony", "cpu-123", 128);
        mp.startDevice();
        int bl = mp.chargeDevice();
        System.out.println("Battery level after charging: " + bl);
        System.out.println(mp);
        mp.extendInternalMemory(128);
    }
}
