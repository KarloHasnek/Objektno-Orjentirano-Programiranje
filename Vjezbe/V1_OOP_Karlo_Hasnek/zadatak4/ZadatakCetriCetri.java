package zadatak4;

import java.util.Scanner;

public class ZadatakCetriCetri {


    public static void stringInputDoWhile() {
        Scanner sc = new Scanner(System.in);
        String unos = "a";
        do {
            System.out.println("Unesite string: ");
            unos = sc.next();
            System.out.println("Unos: " + unos);
            System.out.println("Zelite li ponoviti unos? (za ponavljanje pritisnite y): ");
            unos = sc.next();
            if (unos.equals("y")); else break;
		} while(unos instanceof String);
        System.out.println("Izabrali ste izlaz iz programa!");
        sc.close();
    }
    
}
