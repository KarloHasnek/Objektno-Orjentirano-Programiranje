package zadatak3;

import java.util.*;

import static zadatak3.AUXCLS.addFiveRandomElements;

public class Zadatak3 {

    public static void main(String[] args) {

        // Generating sets
        HashSet<String> hs = new HashSet<>();
        TreeSet<String> ts = new TreeSet<>();
        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        // Adding 5 random elements to each set
        AUXCLS.addFiveRandomElements(hs);
        AUXCLS.addFiveRandomElements(ts);
        AUXCLS.addFiveRandomElements(lhs);

        // Printing sets
        System.out.println("----------------------------------------");
        System.out.println(hs);
        System.out.println(ts);
        System.out.println(lhs);
        System.out.println("----------------------------------------");

        // Adding "Nema ga" to hs
        hs.add("Nema ga");
        System.out.println("HashSet sa 'Nema ga' --> " + hs);

        // Searching sets for "Nema ga"
        System.out.println("-----------------------------------");
        AUXCLS.searchSet(hs);
        AUXCLS.searchSet(ts);
        AUXCLS.searchSet(lhs);
        System.out.println("-----------------------------------");

        // Removing "Nema ga" from HashSet
        AUXCLS.removeFromSet(hs, "Nema ga");

        // Custom printing sets
        AUXCLS.printSet(hs);
        AUXCLS.printSet(ts);
        AUXCLS.printSet(lhs);
    }



}
