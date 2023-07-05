package sem4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 1.
        LinkedList list = new LinkedList();
        ArrayList<Integer> arrFrom = new ArrayList<>();
        arrFrom.add(3);
        arrFrom.add(7);
        arrFrom.add(2);
        arrFrom.add(4);
        arrFrom.add(9);
        list.fromArray(arrFrom);
        list.printList();
        list.reverse();
        list.printList();

        // 2.
        MyQueue queue = new MyQueue();
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(1);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.getElements().printList();
        System.out.println("---");
        System.out.println(queue.first().value);
        System.out.println("---");
        System.out.println(queue.dequeue().value);
        System.out.println("---");
        System.out.println(queue.dequeue().value);
        System.out.println("---");
        queue.getElements().printList();
    }
}
