package zadatak1;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Haker {

    // Atributi
    private int[] randomCodes = new int[3];
    private int cnt;
    Semafor semafor;
    private static final int MININT = 0;
    private static final int MAXINT = 9;

    // Konstruktor
    public Haker(Semafor semafor){
        this.semafor = semafor;
        System.out.println("Semafor: " + semafor.toString() + "je pod kontrolom hakera.");
    }

    // Metode 
    private void stanjeNovo() {

        for (int i = 0; i < 3; i++) {
            randomCodes[i] = ThreadLocalRandom.current().nextInt(MININT, MAXINT);
        }
        System.out.println("Generirani su novi kodovi: " + Arrays.toString(randomCodes));

    }

    public void manualProgrammingSemafor(){
        cnt = 0;
        stanjeNovo();
        semafor.setCrveno(String.valueOf(randomCodes[0]));
        semafor.setZeleno(String.valueOf(randomCodes[1]));
        semafor.setZuto(String.valueOf(randomCodes[2]));
        for(int stanje : randomCodes) {
            System.out.println("Novo stanje za " + cnt + " je: " + stanje);
            cnt++;
        }
        semafor.stanje(randomCodes[0]);
    }
}