package zadatak3;

import java.util.concurrent.ArrayBlockingQueue;

public class QueueTest {

    public static void main(String[] args) {

        // Generating Queue with 5 elements limit
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

        // Adding 5 elements
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        // Printing queue
        System.out.println("Queue -->" + queue);

        try {
            // Trying to add 6. element
            System.out.println("----------------------------------");
            System.out.println("Trying to add 6. element...");
            queue.add(6);
        } catch (IllegalStateException e) {
            System.out.println("Queue is full.");
        }
        System.out.println("----------------------------------");


        // Testing AUXCLS methods
        AUXCLS.processElement(queue, 1);
        System.out.println("Queue after processElement: " + queue);

        AUXCLS.processElement(queue, 0);
        System.out.println("Queue after processElement: " + queue);

        AUXCLS.processElement(queue, 1);
        System.out.println("Queue after processElement: " + queue);

        AUXCLS.addElement(queue, 7);
        System.out.println("Queue after addElement: " + queue);

        AUXCLS.addElement(queue, 8);
        System.out.println("Queue after addElement: " + queue);

        AUXCLS.addElement(queue, 9);
        System.out.println("Queue after addElement: " + queue);
    }
}
