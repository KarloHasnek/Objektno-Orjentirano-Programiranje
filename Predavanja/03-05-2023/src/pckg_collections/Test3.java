package pckg_collections;

import java.util.HashMap;
import java.util.HashSet;

public class Test3 {
    
    public static void main(String[] args) {
        
        HashMap<Integer, String> mapa = new HashMap<>();
        mapa.put(10, "Franka");
        mapa.put(20, "Jure");
        mapa.put(35, "Franka");
        mapa.put(90, "Ivan");
        mapa.put(43, "Josip");
        System.out.println(mapa);
        printMapElements(mapa);
        System.out.println(allSameValueReturnKeys(mapa, "Franka"));
    }

    private static void printMapElements(HashMap<Integer, String> mapa) {
        for (Integer key : mapa.keySet()) {
            System.out.println("Key: " + key);
            System.out.println("Value: " + mapa.get(key));
        }
    }

    private static HashSet<Integer> allSameValueReturnKeys(HashMap<Integer, String> mapa, String value) {

        HashSet<Integer> keys = new HashSet<>();

        for (Integer key : mapa.keySet()) {
            if (mapa.get(key).equals(value)) {
                keys.add(key);
            }
        }
        return keys;
    }
}
