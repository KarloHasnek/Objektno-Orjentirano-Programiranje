package zadatak4;

import java.util.Scanner;

public class ZadatakCetriDva {
    
    
    public static void sumaPrvihNPrirodnih() {
        
        int suma = 0;
        Scanner sc = new Scanner(System.in);
        long unos;

        while (true) {
            System.out.println("Unesite do kojeg broja ce se racunati suma: ");
            unos = sc.nextLong();
            if (unos > 2147483647 || unos < -2147483648) {
                System.out.println("Uneseni broj nije valjan, pokusajte sa drugim brojem.");
            } else {
                unos =  (int) unos;
                break;
            }
        }

        for (int i = 1; i < unos; i++) {
            suma += i;
        }

        System.out.println("Suma iznosi: " + suma);
        sc.close();
    }
}
