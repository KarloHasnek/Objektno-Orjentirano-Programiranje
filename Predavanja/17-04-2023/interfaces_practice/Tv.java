package interfaces_practice;

import java.util.concurrent.ThreadLocalRandom;

public class Tv implements Settings{

    private String model;
    private int screenSize;
    private int SerialNumber;
    private static int cntSerialNumber = 1;

    public Tv(String model, int screenSize){
        this.model = model;
        this.screenSize = screenSize;
        this.SerialNumber = cntSerialNumber++;
    }

    @Override
    public void setBrightness() {
        System.out.println("Brightness set to: " + ThreadLocalRandom.current().nextInt(0, 100));
    }

    @Override
    public void activateIntelligentMode() {
        System.out.println("Activating smart settings.");
    }
}
