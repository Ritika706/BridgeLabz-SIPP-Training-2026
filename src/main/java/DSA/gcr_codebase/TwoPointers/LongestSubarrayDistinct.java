package main.java.DSA.gcr_codebase.TwoPointers;

import java.util.*;

public class LongestSubarrayDistinct {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        int size = sc.nextInt();

        int[] keyIds = new int[size];

        // Input array
        for (int i = 0; i < size; i++) {
            keyIds[i] = sc.nextInt();
        }

        // Maximum distinct elements allowed
        int n = sc.nextInt();

        Map<Integer, Integer> freq = new HashMap<>();

        int start = 0;
        int maxLen = 0;

        for (int end = 0; end < size; end++) {

            freq.put(keyIds[end], freq.getOrDefault(keyIds[end], 0) + 1);

            while (freq.size() > n) {
                int leftKey = keyIds[start];
                freq.put(leftKey, freq.get(leftKey) - 1);

                if (freq.get(leftKey) == 0) {
                    freq.remove(leftKey);
                }

                start++;
            }

            maxLen = Math.max(maxLen, end - start + 1);
        }

        System.out.println(maxLen);

        sc.close();
    }
}