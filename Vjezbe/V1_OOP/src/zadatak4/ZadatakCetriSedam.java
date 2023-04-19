package zadatak4;

import java.util.Scanner;

public class ZadatakCetriSedam {
    
    public static void dobroBoljeNajboljeSwitchCase() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Kako ste? : ");
        String unos = sc.next().toString();

        switch (unos) {
            case "dobro": System.out.println("Hvala, danas sam: " + unos); break;
            case "bolje": System.out.println("Hvala, danas sam: " + unos); break;
            case "najbolje": System.out.println("Hvala, danas sam: " + unos); break;
        
            default: break;
        }

        sc.close();
    }
}
