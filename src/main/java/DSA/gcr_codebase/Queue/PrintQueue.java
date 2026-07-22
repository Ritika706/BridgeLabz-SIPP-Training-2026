package main.java.DSA.gcr_codebase.Queue;

import java.util.*;

public class PrintQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Deque<String> queue = new ArrayDeque<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int choice = sc.nextInt();

            if (choice == 1) {
                String job = sc.next();
                queue.addLast(job);
            } else if (choice == 2) {
                String job = sc.next();
                queue.addFirst(job);
            } else if (choice == 3) {
                if (queue.isEmpty())
                    System.out.println("Queue Empty");
                else
                    System.out.println("Printing: " + queue.removeFirst());
            }
        }

        System.out.println("Remaining Queue: " + queue);
    }
}