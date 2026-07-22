package main.java.DSA.gcr_codebase.TwoPointers;

import java.util.*;

public class PairSumFinder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        int n = sc.nextInt();

        int[] transactions = new int[n];

        // Input array
        for (int i = 0; i < n; i++) {
            transactions[i] = sc.nextInt();
        }

        // Target sum
        int target = sc.nextInt();

        int left = 0;
        int right = n - 1;

        while (left < right) {
            int sum = transactions[left] + transactions[right];

            if (sum == target) {
                System.out.println(transactions[left] + " " + transactions[right]);
                return;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("-1 -1");
    }
}