package main.java.DSA.gcr_codebase.LinkedList.TaskQueue;

class Node {
    int id;
    Node next;

    Node(int id) {
        this.id = id;
        this.next = null;
    }
}

public class TaskQueue {

    Node head;

    // Insert task at end
    public void insertEnd(int id) {
        Node newNode = new Node(id);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Delete task by ID
    public Node deleteTask(Node head, int id) {

        // Case 1: Empty list
        if (head == null) {
            return null;
        }

        // Case 2: First node is to be deleted
        if (head.id == id) {
            return head.next;
        }

        Node prev = null;
        Node curr = head;

        // Search for the node
        while (curr != null && curr.id != id) {
            prev = curr;
            curr = curr.next;
        }

        // Task not found
        if (curr == null) {
            System.out.println("Task not found.");
            return head;
        }

        // Remove the node
        prev.next = curr.next;

        return head;
    }

    // Display queue
    public void display(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.id);

            if (temp.next != null)
                System.out.print(" -> ");

            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        TaskQueue queue = new TaskQueue();

        queue.insertEnd(101);
        queue.insertEnd(102);
        queue.insertEnd(103);
        queue.insertEnd(104);

        System.out.println("Original Task Queue:");
        queue.display(queue.head);

        // Delete task with ID 103
        queue.head = queue.deleteTask(queue.head, 103);

        System.out.println("After deleting task 103:");
        queue.display(queue.head);
    }
}