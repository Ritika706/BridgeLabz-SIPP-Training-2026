package main.java.DSA.gcr_codebase.Hashing;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] strs = new String[n];

        for (int i = 0; i < n; i++)
            strs[i] = sc.next();

        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);

            String key = new String(ch);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }

        for (List<String> group : map.values()) {
            System.out.println(group);
        }
    }
}