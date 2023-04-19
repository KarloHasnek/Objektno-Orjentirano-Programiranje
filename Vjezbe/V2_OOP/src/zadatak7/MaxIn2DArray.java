package zadatak7;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class MaxIn2DArray {
    
    public static void main(String[] args) {
        
        int[][] arr = new int[3][4];
        final int MININT = 0;
        final int MAXINT = 100;
        int maxi = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                
                arr[i][j] = ThreadLocalRandom.current().nextInt(MININT, MAXINT);
                if (arr[i][j] > maxi) {
                    maxi = arr[i][j];
                }

            }
        }        
        System.out.println(Arrays.deepToString(arr));
        System.out.println("Najveci clan u 2D nizu je: " + maxi);
    }
}
