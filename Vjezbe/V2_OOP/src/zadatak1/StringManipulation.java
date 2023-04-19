package zadatak1;

import java.util.Scanner;

public class StringManipulation {
    
    private static Scanner sc = new Scanner(System.in);
    private static String[] stringovi = {"Vasa", "vana plurimum", "sonant"};

    static void inputElementsOfArr(){
        String[] arr = new String[4];
        String arr2 = stringovi[0] + " " + stringovi[1] + " " + stringovi[2];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Unesite string: ");
            String unos = sc.nextLine();
            arr[i] = unos;
        }
        System.out.println(arr2);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


}
