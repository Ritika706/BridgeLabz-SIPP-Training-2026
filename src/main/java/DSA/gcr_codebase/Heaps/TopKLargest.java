package main.java.DSA.gcr_codebase.Heaps;
import java.util.*;

public class TopKLargest {

    public static void main(String[] args) {

        int[] transactions = {100, 50, 200, 80, 300, 250};
        int k = 3;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int value : transactions) {

            pq.add(value);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        ArrayList<Integer> result = new ArrayList<>();

        while (!pq.isEmpty()) {
            result.add(pq.poll());
        }

        Collections.reverse(result);

        System.out.println(result);
    }
}