package main.java.DSA.gcr_codebase.Hashing;

import java.util.*;

public class FrequencyMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        int maxFreq = 0;
        int ans = -1;

        for (int i = 0; i < n; i++) {
            int code = sc.nextInt();

            int freq = map.getOrDefault(code, 0) + 1;
            map.put(code, freq);

            if (freq > maxFreq) {
                maxFreq = freq;
                ans = code;
            }
        }

        System.out.println("Most Frequent Error Code: " + ans);
    }
}