package main.java.DSA.gcr_codebase.TwoPointers;

import java.util.*;

public class TripletSumFinder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        int n = sc.nextInt();

        int[] jobs = new int[n];

        // Input array
        for (int i = 0; i < n; i++) {
            jobs[i] = sc.nextInt();
        }

        // Target sum
        int target = sc.nextInt();

        Arrays.sort(jobs);

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < n - 2; i++) {

            // Skip duplicate first elements
            if (i > 0 && jobs[i] == jobs[i - 1])
                continue;

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = jobs[i] + jobs[left] + jobs[right];

                if (sum == target) {
                    result.add(Arrays.asList(jobs[i], jobs[left], jobs[right]));

                    // Skip duplicate second elements
                    while (left < right && jobs[left] == jobs[left + 1])
                        left++;

                    // Skip duplicate third elements
                    while (left < right && jobs[right] == jobs[right - 1])
                        right--;

                    left++;
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        if (result.isEmpty()) {
            System.out.println("No triplets found");
        } else {
            for (List<Integer> triplet : result) {
                System.out.println(triplet);
            }
        }

        sc.close();
    }
}