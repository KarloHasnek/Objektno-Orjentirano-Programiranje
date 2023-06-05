package pckg_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestInput {

    private static Scanner scanner;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter some number that can be considered as double.");
            try {
                double dn = scanner.nextDouble();
                System.out.println("You have entered: " + dn);
            } catch (InputMismatchException e) {
                System.out.println("Wrong input from keyboard - double expected...");
                String oldScanner = scanner.next();
                System.out.println("Memory from scanner: " + oldScanner);
                System.out.println("Memory now cleared.");
            } finally {
                System.out.println("Enter y for continue and n for exit.");
                String s = scanner.next();
                if (s.equalsIgnoreCase("y")){
                    System.out.println("You chose new input of double value...");
                } else {
                    System.out.println("Exit from input prompting...");
                    break;
                }
            }
        }
    }
}
