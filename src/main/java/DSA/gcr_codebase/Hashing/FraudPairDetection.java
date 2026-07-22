package main.java.DSA.gcr_codebase.Hashing;

import java.util.*;

public class FraudPairDetection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int target = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                System.out.println("Indices: " + map.get(complement) + " " + i);
                return;
            }

            map.put(arr[i], i);
        }

        System.out.println("No pair found");
    }
}