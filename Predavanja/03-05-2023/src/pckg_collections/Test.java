package pckg_collections;

import java.util.ArrayList;
import java.util.HashSet;

public class Test {
    
    public static void main(String[] args) {

        ArrayList<String> lst = new ArrayList<>(7);
        populateList(lst, 7);
        System.out.println(lst);

        lst.add("NOVI");
        lst.add("NOVI");
        System.out.println(lst);

        HashSet<String> set1 = new HashSet<>(lst);
        System.out.println(set1);

        for (Object element : set1) {
            System.out.println(element);
        }
    }

    private static <E> void populateList(ArrayList<E> lista, int numElements) {

        for (int i = 0; i < numElements; i++) {
            E element = (E) new Object();
            lista.add(element);
            System.out.println("Added new element: " + element);
        }
    }
}
