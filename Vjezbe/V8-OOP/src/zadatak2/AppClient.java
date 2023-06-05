package zadatak2;

import java.util.Scanner;

public class AppClient {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int inputInt;
        boolean status = true;

        while (status) {
            System.out.println("Please enter an integer: ");
            try {
                inputInt = sc.nextInt();
                System.out.println("You have entered -> " + inputInt);
                System.out.println("Finishing program.");
                status = false;
            } catch (Exception e) {
                System.out.println("Input is incorrect!");
                sc.nextLine(); // Clearing Scanner
                System.out.println("Try again y/n -> ");
                String continueInput = sc.nextLine();
                if (!continueInput.equalsIgnoreCase("y")) {
                    status = false;
                }
            }
        }
    }
}
