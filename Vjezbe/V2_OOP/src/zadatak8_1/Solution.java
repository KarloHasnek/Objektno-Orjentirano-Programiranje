package zadatak8_1;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    private static Scanner scanner;
    
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        String[] arr = userInput(5);
        System.out.println(Arrays.toString(arr));
    }

    private static String[] userInput(int numElements) {
        String[] strArr = new String[numElements];

        for (int i = 0; i < numElements; i++) {
            System.out.println("Unesite jedan string...");
            String unos = scanner.nextLine();
            strArr[i] = unos;
        }
        System.out.println("Finished!!!");

        return strArr;
    }
}
