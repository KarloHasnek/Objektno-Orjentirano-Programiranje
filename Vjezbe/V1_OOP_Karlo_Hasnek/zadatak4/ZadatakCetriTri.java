package zadatak4;

import java.util.Scanner;

public class ZadatakCetriTri {
    

    public static void guessingNumber() {
        
        Scanner sc = new Scanner(System.in);
        long unos;

        while (true) {
            System.out.println("Unesite broj: ");
            unos = sc.nextLong();
            if (unos > 2147483647 || unos < -2147483648) {
                System.out.println("Uneseni broj nije valjan jer nije u rasponu tipa integer, pokusajte ponovno!");
            } else if (unos == 158) {
                unos = (int) unos;
                System.out.println("Unesena je trazena vrijednost! " + unos); break;
            } else System.out.println(unos);
        }
        sc.close();
    }
}
