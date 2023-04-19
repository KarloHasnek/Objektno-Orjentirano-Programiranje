package zadatak6;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class CopyOfEquals {
    
    public static void main(String[] args) {
        
        int[] arr = new int[15];
        final int MININT = 0;
        final int MAXINT = 100;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(MININT, MAXINT);
        }

        int[] arr2 = Arrays.copyOf(arr, arr.length);
        boolean state = Arrays.equals(arr, arr2);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println("Are these arrays equal? ->" + state);
    }
}
