package main.java.DSA.gcr_codebase.LinkedList.MergeLogStreams;

class Node {
    int time;
    Node next;

    Node(int time) {
        this.time = time;
        this.next = null;
    }
}

public class MergeLogStreams {

    // Merge two sorted linked lists
    public Node merge(Node list1, Node list2) {

        // Dummy node (placeholder)
        Node dummy = new Node(-1);
        Node tail = dummy;

        while (list1 != null && list2 != null) {

            if (list1.time <= list2.time) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }

            tail = tail.next;
        }

        // Attach remaining nodes
        if (list1 != null) {
            tail.next = list1;
        }

        if (list2 != null) {
            tail.next = list2;
        }

        return dummy.next;
    }

    // Display list
    public void display(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.time);

            if (temp.next != null)
                System.out.print(" -> ");

            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        MergeLogStreams obj = new MergeLogStreams();

        // First sorted list
        Node list1 = new Node(1);
        list1.next = new Node(4);
        list1.next.next = new Node(7);

        // Second sorted list
        Node list2 = new Node(2);
        list2.next = new Node(3);
        list2.next.next = new Node(8);

        System.out.println("First Log Stream:");
        obj.display(list1);

        System.out.println("Second Log Stream:");
        obj.display(list2);

        Node merged = obj.merge(list1, list2);

        System.out.println("Merged Log Stream:");
        obj.display(merged);
    }
}