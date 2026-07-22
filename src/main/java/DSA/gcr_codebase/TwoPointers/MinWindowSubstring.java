package main.java.DSA.gcr_codebase.TwoPointers;

import java.util.*;

public class MinWindowSubstring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input strings
        String s = sc.next();
        String t = sc.next();

        if (s.isEmpty() || t.isEmpty()) {
            System.out.println("");
            return;
        }

        Map<Character, Integer> need = new HashMap<>();

        // Store frequency of characters in t
        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> window = new HashMap<>();

        int required = need.size();
        int formed = 0;
        int start = 0;
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;

        for (int end = 0; end < s.length(); end++) {

            char c = s.charAt(end);
            window.put(c, window.getOrDefault(c, 0) + 1);

            if (need.containsKey(c) &&
                window.get(c).intValue() == need.get(c).intValue()) {
                formed++;
            }

            while (formed == required) {

                if (end - start + 1 < minLen) {
                    minLen = end - start + 1;
                    minStart = start;
                }

                char leftChar = s.charAt(start);
                window.put(leftChar, window.get(leftChar) - 1);

                if (need.containsKey(leftChar) &&
                    window.get(leftChar) < need.get(leftChar)) {
                    formed--;
                }

                start++;
            }
        }

        if (minLen == Integer.MAX_VALUE) {
            System.out.println("");
        } else {
            System.out.println(s.substring(minStart, minStart + minLen));
        }

        sc.close();
    }
}