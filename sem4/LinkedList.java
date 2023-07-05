package sem4;

import java.util.ArrayList;

public class LinkedList {
    Node head;

    static class Node {
        int value;
        Node next; // *scowls* this is so much easier in c++

        Node(int value){
            this.value = value;
        }
    }

    public LinkedList(){}

    public void fromArray(ArrayList<Integer> arr){
        for (Integer integer : arr) {
            add(integer);
        }
    }

    public void add(Integer value){
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public Node reverse(){
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }

    public void printList(){
        Node current = head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }
}
