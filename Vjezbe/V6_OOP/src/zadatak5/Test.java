package zadatak5;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

    public static void main(String[] args) {

        ArrayList<String> vehicles = new ArrayList<>();
        vehicles.add("auto");
        vehicles.add("svemirski brod");
        vehicles.add("avion");
        vehicles.add("helikopter");
        vehicles.add("jedrilica");
        vehicles.add("gliser");
        vehicles.add("romobil");
        vehicles.add("bicikla");

        // Default
        System.out.println("Default sort");
        System.out.println("ArrayList --> " + vehicles);

        // Sort without comparator sorts alphabetically
        Collections.sort(vehicles);
        System.out.println("Collections.sort sort");
        System.out.println("ArrayList --> " + vehicles);

        // Sort with comparator sorts by length
        Collections.sort(vehicles, new LengthStrComparator());
        System.out.println("Collections.sort sort with comparator");
        System.out.println("ArrayList --> " + vehicles);
    }
}
