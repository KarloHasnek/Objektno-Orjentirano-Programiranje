package zadatak2;

import java.util.Scanner;

public class ProsjekTemperatura {
    
    static Scanner sc = new Scanner(System.in);

    public static void prosjekTemperatura(int brojMjerenja){
        float[] mjerenja = new float[brojMjerenja];
        float prosjek = 0.0f;
        int ispodProsjeka = 0;
        int iznadProsjeka = 0;

        for (int i = 0; i < brojMjerenja; i++) {
            System.out.println("Unesite vrijednost mjerenja: ");
            float unos = sc.nextFloat();
            mjerenja[i] = unos;
            prosjek += unos;
        }
        prosjek = prosjek / brojMjerenja;
        
        for (float f : mjerenja) {
            if (f < prosjek) {
                ispodProsjeka++;
            } if (f > prosjek) {
                iznadProsjeka++;
            }
        }

        System.out.println("Prosjecna temperatura iznosi: " + prosjek);
        System.out.println("Broj mjerenja je: " + brojMjerenja);
        System.out.println("Ispod prosjeka: " + ispodProsjeka);
        System.out.println("Iznad prosjeka: " + iznadProsjeka);
    }

}


