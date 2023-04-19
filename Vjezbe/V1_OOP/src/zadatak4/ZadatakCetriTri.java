package zadatak4;

import java.util.Scanner;

public class ZadatakCetriTri {
    

    public static void guessingNumber() {
        
        Scanner sc = new Scanner(System.in);
        int unos = 0;
        boolean state = true;

        while (state) {
                try {
                    System.out.println("Enter a number");
                    unos = Integer.parseInt(sc.next());
                    if (unos == 158) {
                        System.out.println("Pogodili ste");
                        state = false;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Niste unjeli int tip podatka.");
                }
            }
            sc.close();
        }

        public static void guessingNumber2() {
        
            Scanner sc = new Scanner(System.in);
            int unos1;
            boolean unos2;
            boolean state = true;
    
            while (state) {

                unos1 = sc.nextInt();
                unos2 = sc.hasNextInt();
                //what i see
                //unos = a2
                //what java c's
                //unos = true
                if (unos) {
                    System.out.println("Broj je");
                    unos = int unos;
                }
                    
                }
                sc.close();
            }
}
