package main.java.DSA.gcr_codebase.Heaps;
import java.util.*;

public class KthLargestScore {

    public static void main(String[] args) {

        int[] scores = {95, 80, 70, 60, 50};
        int k = 3;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int score : scores) {

            pq.add(score);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        System.out.println("Kth largest score: " + pq.peek());
    }
}