package zadatak1zadatak2;

import java.util.Arrays;
import java.util.UUID;

public class Test2 {
    
    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        System.out.println(uuid);

        int num = 4/5;
        System.out.println(num);

        int[][] niz = AUXCLS.fillArrSolution();

        System.out.println(Arrays.deepToString(niz));
    }
}
