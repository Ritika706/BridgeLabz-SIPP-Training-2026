package main.java.DSA.gcr_codebase.LinkedList.BrowserHistory;

class Node {
    String page;
    Node next;

    Node(String page) {
        this.page = page;
        this.next = null;
    }
}

public class BrowserHistory {

    Node head;

    // Insert at end
    public void insertEnd(String page) {
        Node newNode = new Node(page);

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

    // Reverse the linked list
    public Node reverse(Node head) {

        Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr != null) {

            next = curr.next;   // Save next node

            curr.next = prev;   // Reverse the link

            prev = curr;        // Move prev forward

            curr = next;        // Move curr forward
        }

        return prev;
    }

    // Display list
    public void display(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.page);

            if (temp.next != null)
                System.out.print(" -> ");

            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        BrowserHistory history = new BrowserHistory();

        history.insertEnd("Google");
        history.insertEnd("YouTube");
        history.insertEnd("GitHub");
        history.insertEnd("ChatGPT");

        System.out.println("Original History:");
        history.display(history.head);

        history.head = history.reverse(history.head);

        System.out.println("Reversed History:");
        history.display(history.head);
    }
}