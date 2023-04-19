package zadatak3;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class AUXCLS {

    private static final int MININT = 0;
    private static final int MAXINT = 330;

    
    public static int[][] gen2DInt(int numRws, int numCol) {

        int[][] int2d = new int[numRws][numCol];

        for (int i = 0; i < numRws; i++) {
            for (int j = 0; j < numCol; j++) {
                int rndVal = ThreadLocalRandom.current().nextInt(MININT, MAXINT);
                int2d[i][j] = rndVal;
                System.out.print(int2d[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Finished generating 2D int array.");
        return int2d;
    }

    public static void print2DarraySND(int[][] arr) {
        for (int[] rw : arr) {
            System.out.println(Arrays.toString(rw));
            
        }
    }
}
