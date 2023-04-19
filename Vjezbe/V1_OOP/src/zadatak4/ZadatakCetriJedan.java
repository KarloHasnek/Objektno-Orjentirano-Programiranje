package zadatak4;

import java.util.Scanner;

public class ZadatakCetriJedan {

    public static void sphere() {

        double volume;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a radius: ");
        double r = 1;
        while (r < 10) {
            r = sc.nextDouble();
            if (r == 10) {
                System.out.println("Goodbye!");
            } else {
                volume = ((float)4/3)*Math.PI*Math.pow(r, 3);
            System.out.println("Volume is: " + volume);
            }
        }
        sc.close();
    }
}

