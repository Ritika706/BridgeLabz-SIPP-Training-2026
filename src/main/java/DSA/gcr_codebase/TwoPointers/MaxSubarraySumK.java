package main.java.DSA.gcr_codebase.TwoPointers;

import java.util.*;

public class MaxSubarraySumK {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        int n = sc.nextInt();

        int[] cpuLoad = new int[n];

        // Input array
        for (int i = 0; i < n; i++) {
            cpuLoad[i] = sc.nextInt();
        }

        // Window size
        int k = sc.nextInt();

        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int start = 0;

        for (int end = 0; end < n; end++) {
            windowSum += cpuLoad[end];

            if (end >= k - 1) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= cpuLoad[start];
                start++;
            }
        }

        System.out.println(maxSum);

        sc.close();
    }
}