package main.java.DSA.gcr_codebase.Queue;

import java.util.*;

public class HospitalERTriage {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(4);
        pq.offer(1);
        pq.offer(5);
        pq.offer(2);
        pq.offer(3);

        while (!pq.isEmpty()) {
            System.out.println("Treat Patient with Priority: " + pq.poll());
        }
    }
}