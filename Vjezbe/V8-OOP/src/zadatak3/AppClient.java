package zadatak3;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class AppClient {

    public static void main(String[] args) {
            int[] arrayOfInts = genArr(10);
            System.out.println("Lenght of array is -> " + arrayOfInts.length);
        try {
            System.out.println(arrayOfInts[arrayOfInts.length]);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getClass().getCanonicalName() + " in: " + e.getStackTrace()[0]);
            System.out.println("Index out of bounds!");
        } finally {
            System.out.println(Arrays.toString(arrayOfInts));
        }
    }

    private static int[] genArr(int arraySize) throws IndexOutOfBoundsException {

        int[] arrayOfInts = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            arrayOfInts[i] = ThreadLocalRandom.current().nextInt(1, 100);
        }

        return arrayOfInts;
    }
}
