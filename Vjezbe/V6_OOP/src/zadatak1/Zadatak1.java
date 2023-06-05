package zadatak1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Zadatak1 {

    public static void main(String[] args) {

        // Array list example
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");
        arrayList.add("e");

        // Linked list example made from given array list
        LinkedList<String> linkedList = new LinkedList<>(arrayList);
        System.out.println("Array list: " + arrayList);
        System.out.println("Linked list: " + linkedList);

        // Adding elements to linked list
        linkedList.addLast("f");
        linkedList.addFirst("g");
        linkedList.addLast("h");

        System.out.println("----------LINKED LIST----------");
        for (String elem : linkedList) {
            System.out.println(elem);
        }

        // Removing elements from linked list using given method
        String removedElement = updateElementLinkedList(linkedList, 4, "A");
        System.out.println("\nAfter method:");
        System.out.println(linkedList);

        System.out.println("Removed element: " + removedElement);

    }

    private static String updateElementLinkedList(LinkedList<String> linkedList, int index, String element) {
        String removedElement = linkedList.get(index);
        linkedList.set(index, element);
        return removedElement;
    }
}