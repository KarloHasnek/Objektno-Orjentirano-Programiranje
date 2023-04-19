package interfaces_practice;

import java.util.concurrent.ThreadLocalRandom;

public class Lamp implements Settings {

    private String model;
    private int height;
    private int SerialNumber;
    private static int cntSerialNumber = 1;
    private boolean handclap;

    public Lamp(String model, int height){
        this.model = model;
        this.height = height;
        this.SerialNumber = cntSerialNumber++;
        this.handclap = false;
    }

    public void setHandclap(boolean handclap) {
        this.handclap = handclap;
    }

    @Override
    public void setBrightness() {
        System.out.println("Brightness set to: " + ThreadLocalRandom.current().nextInt(0, 10));
    }

    @Override
    public void activateIntelligentMode() {
        if (handclap) {
            System.out.println("Lamp turned on.");
        } else {
            System.out.println("Lamp turned off.");
        }
    }
    
}
