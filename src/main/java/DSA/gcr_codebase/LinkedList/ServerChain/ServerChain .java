package main.java.DSA.gcr_codebase.LinkedList.ServerChain;

class Node {
    String server;
    Node next;

    Node(String server) {
        this.server = server;
        this.next = null;
    }
}

public class ServerChain {

    Node head;

    // Insert server at end
    public void insertEnd(String server) {
        Node newNode = new Node(server);

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

    // Find middle server
    public Node findMiddle(Node head) {

        if (head == null)
            return null;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;          // Move 1 step
            fast = fast.next.next;     // Move 2 steps
        }

        return slow;
    }

    // Display server chain
    public void display(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.server);

            if (temp.next != null)
                System.out.print(" -> ");

            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        ServerChain chain = new ServerChain();

        chain.insertEnd("Server A");
        chain.insertEnd("Server B");
        chain.insertEnd("Server C");
        chain.insertEnd("Server D");
        chain.insertEnd("Server E");

        System.out.println("Server Chain:");
        chain.display(chain.head);

        Node middle = chain.findMiddle(chain.head);

        System.out.println("Middle Server: " + middle.server);
    }
}