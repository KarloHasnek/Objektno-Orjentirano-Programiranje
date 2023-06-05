package zadatak2;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class AUXCLS {

    public static void addToList(ArrayList<Integer> list, int numOfElements){

        for (int i = 0; i < numOfElements; i++) {
            list.add(ThreadLocalRandom.current().nextInt(10,1000));
        }

    }
}
