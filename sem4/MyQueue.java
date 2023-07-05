package sem4;

import sem4.LinkedList.Node;

import java.util.ArrayList;

public class MyQueue {
    private LinkedList elements = new LinkedList();

    public MyQueue() {}

    public MyQueue(LinkedList linkedList) { this.elements = linkedList; }

    public void enqueue(Integer value){
        elements.add(value);
    }

    public Node dequeue(){
        Node removed = elements.head;
        ArrayList<Integer> arrayList = new ArrayList<>();
        Node current = elements.head.next;
        while (current != null) {
            arrayList.add(current.value);
            current = current.next;
        }
        elements = new LinkedList();
        elements.fromArray(arrayList);
        return removed;
    }

    public Node first(){
        return elements.head;
    }

    public LinkedList getElements(){
        return elements;
    }
}
