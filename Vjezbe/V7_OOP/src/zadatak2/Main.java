package zadatak2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        AUXCLS.addToList(arrayList, 10);
        System.out.println(arrayList);

        Collections.sort(arrayList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        System.out.println(arrayList);
    }
}
