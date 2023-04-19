package zadatak1zadatak2;

import java.util.concurrent.ThreadLocalRandom;

public class AUXCLS {
    
    public static int sumNInt(int n) {
        if (n <= 1) {
            return n;
        } else {
            return n + sumNInt(n-1);
        }
    }

    public static long potNKIter(int n, int k){
        long pot = 1;

        for (int i = 1; i <= k; i++) {
            pot *= n;
        }

        return pot;
    }

    public static long potNK(int n, int k) {
        //samo za n > 0
        if (k == 0) {
            return 1;
        } else {
            return n*potNK(n, k-1);
        }
    }

    public static long recFact(int n) {
        if (n == 0) {
            return 1;
        } else return n * recFact(n-1);
    }

    static int RWMX = 5;
    static int COLMX = 5;
    static int cntFillArr = 0;
    static int[][] intNiz = new int[RWMX][COLMX];

    public static int[][] fillArrSolution() {

            int rw = cntFillArr / COLMX;
            int col = cntFillArr % COLMX;
            intNiz[rw][col] = ThreadLocalRandom.current().nextInt(0,100);
            cntFillArr++;

        return intNiz;
    }
}
