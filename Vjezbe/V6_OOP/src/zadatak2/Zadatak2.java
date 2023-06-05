package zadatak2;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Zadatak2 {

    public static void main(String[] args) {

        // TreeMap is sorted by key
        // LinkedHashMap is sorted by order of insertion

        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
        lhm.put(132, "Jure");
        lhm.put(465, "Pero");
        lhm.put(354, "Stipe");
        lhm.put(148, "Jurica");
        lhm.put(879, "Perica");

        TreeMap<Integer, String> tm = new TreeMap<>(lhm);

        System.out.println("----------------LINKED HASH MAP----------------");
        for (Integer key : lhm.keySet()) {
            System.out.println("Key: " + key + ", Value: " + lhm.get(key));
        }

        System.out.println("----------------TREE MAP----------------");
        for (Integer key : tm.keySet()) {
            System.out.println("Key: " + key + ", Value: " + tm.get(key));
        }
    }
}
