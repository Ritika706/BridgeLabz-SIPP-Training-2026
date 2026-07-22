package main.java.DSA.Scenerio_Based.Hashing;

import java.util.HashMap;

public class SubarraySumK {

    public static int subarraySum(int nums[], int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int prefix = 0;
        int count = 0;

        for (int num : nums) {

            prefix += num;

            if (map.containsKey(prefix - k)) {
                count += map.get(prefix - k);
            }

            map.put(prefix,
                    map.getOrDefault(prefix, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {

        int nums[] = {1, 2, 3, -2, 5};

        int k = 6;

        System.out.println("Subarrays = " +
                subarraySum(nums, k));
    }
}