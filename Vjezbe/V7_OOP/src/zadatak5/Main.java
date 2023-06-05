package zadatak5;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("car");
        linkedList.add("helicopter");
        linkedList.add("electronic bike");
        linkedList.add("truck");
        linkedList.add("motorcycle");
        linkedList.add("carriage");

        System.out.println("----------------------------");
        printList(linkedList);
        System.out.println("-----------------------------");
        printListWithIterator(linkedList);
        System.out.println("----------------------------");

        System.out.println("-----------------------------");
        System.out.println("Adding element to the list...");
        linkedList.add(6, "Stagecoach");
        System.out.println("----------------------------");
        printListWithIterator(linkedList);
        System.out.println("----------------------------");
    }

    private static <E> void printList(List<E> list) {
        // Printing the list using for-each loop
        for (E element : list) {
            System.out.println(element);
        }
    }

    private static <E> void printListWithIterator(List<E> list) {
        // Creating an iterator
        ListIterator<E> iterator = list.listIterator();

        // Iterating the given list
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
