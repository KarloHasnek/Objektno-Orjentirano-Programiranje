package pckg_exceptions;

import javax.management.InvalidAttributeValueException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GameAge {

    private static Scanner scanner;
    private static ArrayList<Integer> ages;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);
        ages = new ArrayList<>();

        enterAge();
    }


    private static void enterAge(){
            boolean status = true;
            while (status) {
                int age = 0;
                System.out.println("Enter your age value as integer: ");
                try {
                    age = scanner.nextInt();
                    checkAge(age);
                    ages.add(age);
                } catch (InputMismatchException e) {
                    System.out.println("Integer is needed.");
                } catch (InvalidAttributeValueException e) {
                    System.out.println(e.getMessage());
                } finally {
                    scanner.nextLine();
                    System.out.println("For new input press y | n for exit.");
                    String cont = scanner.next();
                    if (cont.equalsIgnoreCase("y")){
                        System.out.println("---------------Continue---------------");
                    } else {
                        System.out.println("Exiting.... Goodbye.");
                        status = false;
                    }
                }
            }
            calculateAvg(ages);
        }



    private static void checkAge(int ageVal) throws InvalidAttributeValueException {

        if (ageVal <= 0 || ageVal > 120){
            System.out.println("Wrong value - must be 1 or greater till 120...");
            throw new InvalidAttributeValueException("This value in not allowed");
        } else {
            System.out.println("You have entered acceptable value: " + ageVal);
        }
    }

    private static void calculateAvg(ArrayList<Integer> values) {
        long sumValues = 0;
        float avg;
        for (Integer val: values) {
            sumValues += val;
        }
        avg = (float) sumValues / values.size();

        System.out.println("Values:\n" + values);
        System.out.printf("Average value is: %3.2f", avg);
    }
}
