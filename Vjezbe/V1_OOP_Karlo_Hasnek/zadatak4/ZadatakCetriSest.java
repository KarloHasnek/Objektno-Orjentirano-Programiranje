package zadatak4;

import java.util.Scanner;

public class ZadatakCetriSest {
    
    static Scanner sc = new Scanner(System.in);

    public static void dobroBoljeNajbolje() {

        String dobro = "dobro";
        String bolje = "bolje";
        String najbolje = "najbolje";

        System.out.println("Unesite string: ");
        String unos = sc.next();

        if (unos.equals(dobro) || unos.equals(bolje) || unos.equals(najbolje)) {
            System.out.println("Hvala, danas sam: " + unos);
        } else {
            System.out.println("Sigurno ce biti bolje :)");
        }
    }
}
