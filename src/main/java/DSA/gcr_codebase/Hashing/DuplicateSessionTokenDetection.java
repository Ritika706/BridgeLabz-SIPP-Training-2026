package main.java.DSA.gcr_codebase.Hashing;

import java.util.*;

public class DuplicateSessionTokenDetection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        HashSet<String> set = new HashSet<>();

        boolean duplicate = false;

        for (int i = 0; i < n; i++) {
            String token = sc.next();

            if (set.contains(token)) {
                duplicate = true;
                break;
            }

            set.add(token);
        }

        System.out.println(duplicate);
    }
}