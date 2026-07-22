package main.java.DSA.Scenerio_Based.TwoPointers;


import java.util.*;

public class LongestWaterLevelRange {

    public static int longestRange(int[] levels, int limit) {

        Deque<Integer> maxDeque = new LinkedList<>();
        Deque<Integer> minDeque = new LinkedList<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < levels.length; right++) {

            while (!maxDeque.isEmpty() &&
                    levels[maxDeque.peekLast()] < levels[right]) {
                maxDeque.pollLast();
            }

            while (!minDeque.isEmpty() &&
                    levels[minDeque.peekLast()] > levels[right]) {
                minDeque.pollLast();
            }

            maxDeque.offerLast(right);
            minDeque.offerLast(right);

            while (levels[maxDeque.peekFirst()] -
                    levels[minDeque.peekFirst()] > limit) {

                if (maxDeque.peekFirst() == left)
                    maxDeque.pollFirst();

                if (minDeque.peekFirst() == left)
                    minDeque.pollFirst();

                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {

        int[] levels = {5,4,2,4,6,7,8,6};

        int limit = 3;

        System.out.println("Longest Period = " +
                longestRange(levels, limit));
    }
}