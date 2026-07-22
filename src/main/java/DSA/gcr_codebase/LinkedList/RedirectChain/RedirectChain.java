package main.java.DSA.gcr_codebase.LinkedList.RedirectChain;

class Node {
    String url;
    Node next;

    Node(String url) {
        this.url = url;
        this.next = null;
    }
}

public class RedirectChain {

    Node head;

    // Detect cycle
    public boolean hasCycle(Node head) {

        if (head == null)
            return false;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;          // Move 1 step
            fast = fast.next.next;     // Move 2 steps

            // If both pointers meet, cycle exists
            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        RedirectChain chain = new RedirectChain();

        // Create nodes
        Node a = new Node("URL A");
        Node b = new Node("URL B");
        Node c = new Node("URL C");
        Node d = new Node("URL D");

        // Connect nodes
        chain.head = a;
        a.next = b;
        b.next = c;
        c.next = d;

        // Create a cycle: D -> B
        d.next = b;

        if (chain.hasCycle(chain.head)) {
            System.out.println("Cycle detected.");
        } else {
            System.out.println("No cycle.");
        }
    }
}