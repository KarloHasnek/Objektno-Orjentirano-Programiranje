package zadatak4;

import java.util.Scanner;
// we use next().charAt(0). next() function returns the next token/word in the input as a string
// and charAt(0) function returns the first character in that string.

public class ZadatakCetriPet {
    
    public static void switchCase() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite znak: ");
        char unos = sc.next().charAt(0);

        switch (unos) {
            case 'a': System.out.println("Your input was: " + unos); break;
            case 'b': System.out.println("Your input was: " + unos); break;
            case 'c': System.out.println("Your input was: " + unos); break;
            case 'd': System.out.println("Your input was: " + unos); break;

            default:
                System.out.println("Uneseni znak nije predviden");
        }
        sc.close();
    }
}
