package main.java.DSA.gcr_codebase.LinkedList.PlaylistQueue;

class Node {
    String track;
    Node next;

    Node(String track) {
        this.track = track;
        this.next = null;
    }
}

public class PlaylistQueue {

    Node head;

    // Insert at end
    public void insertEnd(String track) {
        Node newNode = new Node(track);

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

    // Insert after the given node
    public void insertAfter(Node current, String track) {

        if (current == null) {
            System.out.println("Current track not found.");
            return;
        }

        Node newNode = new Node(track);

        // Step 1: Save current's next
        newNode.next = current.next;

        // Step 2: Link current to new node
        current.next = newNode;
    }

    // Display playlist
    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.track);

            if (temp.next != null)
                System.out.print(" -> ");

            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        PlaylistQueue playlist = new PlaylistQueue();

        playlist.insertEnd("Song A");
        playlist.insertEnd("Song B");
        playlist.insertEnd("Song C");
        playlist.insertEnd("Song D");

        System.out.println("Original Playlist:");
        playlist.display();

        // Suppose Song B is currently playing
        Node currentTrack = playlist.head.next;

        // Insert new track after Song B
        playlist.insertAfter(currentTrack, "New Song");

        System.out.println("Playlist after insertion:");
        playlist.display();
    }
}