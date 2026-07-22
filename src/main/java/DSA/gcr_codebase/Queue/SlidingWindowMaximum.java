package main.java.DSA.gcr_codebase.Queue;

import java.util.*;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < arr.length; i++) {

            while (!dq.isEmpty() && dq.peekFirst() <= i - k)
                dq.pollFirst();

            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i])
                dq.pollLast();

            dq.offerLast(i);

            if (i >= k - 1)
                System.out.print(arr[dq.peekFirst()] + " ");
        }
    }
}