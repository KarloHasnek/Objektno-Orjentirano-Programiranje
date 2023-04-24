import java.util.Random;

public class Robot implements Comparable<Robot> {

    private String name;
    private int id;
    private static int cntID = 10;
    private static final int MinLen = 3;
    private static final int MaxLen = 15;
    private static final String alph = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private double batteryLevel;
    private boolean status;
    

    public Robot() {
        this.name = generateName();
        this.id = id + cntID++;
        this.batteryLevel = 100;
        this.status = false;
    }

    public String getName() {
        return this.name;
    }

    public double getBatteryLevel() {
        return this.batteryLevel;
    }

    public void discharge() {
        this.batteryLevel = Math.random()*this.batteryLevel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    private String generateName() {

        String name = "";
        //int lenChars = (int) (Math.random() * (MaxLen - MinLen)) + MinLen;
        Random random = new Random();
        int lenChars = random.nextInt(MinLen, MaxLen + 1);
        for (int i = 0; i < lenChars; i++) {
            name += alph.charAt(random.nextInt(0, alph.length()));
        }

        return name;
    }

    @Override
    public int compareTo(Robot o2) {
        if (this.getName().length() > o2.getName().length()) {
            return 1;
        } else if (this.getName().length() < o2.getName().length()) {
            return -1;
        } else return 0;
    }

    @Override
    public String toString() {
        String rep = "";
        if (status) {
            //rep = "Robot [Battery Level: " + batteryLevel + "]";
            rep = String.format("%-15s", batteryLevel);
        } else {
            rep = String.format("%-15s", name);
        }
        return rep;
    }

}
