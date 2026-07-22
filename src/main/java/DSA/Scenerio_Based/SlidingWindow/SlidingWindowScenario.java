package main.java.DSA.Scenerio_Based.SlidingWindow;

import java.util.*;

public class SlidingWindowScenario {

    // 1. Longest Contiguous Period Within Range
    static int longestPeriod(int[] levels, int limit) {

        int left = 0, maxLength = 0;

        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int right = 0; right < levels.length; right++) {

            map.put(levels[right], map.getOrDefault(levels[right], 0) + 1);

            while (map.lastKey() - map.firstKey() > limit) {

                map.put(levels[left], map.get(levels[left]) - 1);

                if (map.get(levels[left]) == 0)
                    map.remove(levels[left]);

                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    // 2. 3Sum (Unique Triplets)
    static void threeSum(int[] nums) {

        Arrays.sort(nums);

        System.out.println("\nTriplets with Sum = 0:");

        for (int i = 0; i < nums.length - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {

                    System.out.println(nums[i] + " " + nums[left] + " " + nums[right]);

                    while (left < right && nums[left] == nums[left + 1])
                        left++;

                    while (left < right && nums[right] == nums[right - 1])
                        right--;

                    left++;
                    right--;
                }

                else if (sum < 0)
                    left++;

                else
                    right--;
            }
        }
    }

    // 3. Maximum Average Subarray of Length k
    static double maxAverage(int[] arr, int k) {

        int sum = 0;

        for (int i = 0; i < k; i++)
            sum += arr[i];

        int maxSum = sum;

        for (int i = k; i < arr.length; i++) {

            sum += arr[i] - arr[i - k];

            maxSum = Math.max(maxSum, sum);
        }

        return (double) maxSum / k;
    }

    public static void main(String[] args) {

        // 1. Longest Period
        int[] waterLevels = {8, 2, 4, 7};
        int limit = 4;

        System.out.println("Longest Contiguous Period = "
                + longestPeriod(waterLevels, limit));

        // 2. Three Sum
        int[] pollution = {-1, 0, 1, 2, -1, -4};

        threeSum(pollution);

        // 3. Maximum Average
        int[] readings = {1, 12, -5, -6, 50, 3};
        int k = 4;

        System.out.println("\nMaximum Average = "
                + maxAverage(readings, k));
    }
}