import java.util.Scanner;

public class MiscClass {
    
    public static void minToDHM(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite vrijednost u minutama: ");
        int unos = sc.nextInt();

        int dani = unos / 1440;
        int ostatak = unos % 1440;
        int sati = ostatak / 60;
        int minute = unos - (dani*1440) - (sati*60);

        System.out.println(unos + " minuta iznosi:");
        System.out.println(dani + " dana, " + sati + " sati i " + minute + " minuta");

        sc.close();
    }
}
