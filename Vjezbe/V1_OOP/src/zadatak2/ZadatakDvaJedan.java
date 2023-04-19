package zadatak2;

import java.util.Scanner;

public class ZadatakDvaJedan {
    
    public static void perSquareAndCube() {

    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter a number to calculate square and cube: ");
        double n = sc.nextDouble();

        double sq = Math.pow(n, 2);
        double cube = Math.pow(n, 3);

        System.out.println("Squared: " + sq);
        System.out.println("Cubed: " + cube);
    }
    
    }
}
