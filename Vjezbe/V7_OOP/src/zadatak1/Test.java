package zadatak1;

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

        printList(vehicles);
        Collections.sort(vehicles, new DescendingStrOrder());
        printList(vehicles);
    }

    private static void printList(ArrayList<String> arrList) {
        System.out.println("\nPrinting list:" + arrList);
        for (String element : arrList) {
            System.out.println(element);
        }
    }
}
