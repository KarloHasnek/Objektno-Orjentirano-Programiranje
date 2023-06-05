package zadatak3;

import java.util.concurrent.ArrayBlockingQueue;

public class AUXCLS {

    public static boolean processElement(ArrayBlockingQueue<Integer> queue, int flag) {

        Integer element = queue.peek();
        boolean state = false;

        if (element != null) {
            if (flag == 1) {
                System.out.println("Processing element: " + element);
                queue.remove();
                state = true;
            } else {
                System.out.println("Element " + element + " is in queue.");
            }
        } else {
            System.out.println("Queue empty.");
        }
        return state;
    }

    public static void addElement(ArrayBlockingQueue<Integer> queue, int element) {

        boolean isAdded = queue.offer(element);
        if (isAdded) {
            System.out.println("Element " + element + " added to queue.");
        } else {
            System.out.println("Queue is full! Element " + element + " not added!");
        }
    }
}
