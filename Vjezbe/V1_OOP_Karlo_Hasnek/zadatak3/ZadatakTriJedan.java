package zadatak3;

import java.util.Scanner;

public class ZadatakTriJedan {
    
    public static void inputControl(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Unesite neki broj: ");
    boolean unos = sc.hasNextInt();
    if (unos) {
        System.out.println("Input is integer.");
        } else System.out.println("Unos nije tip integer.");
        sc.close();
    }
}