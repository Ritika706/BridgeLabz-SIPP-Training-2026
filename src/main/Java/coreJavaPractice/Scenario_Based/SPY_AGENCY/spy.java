package main.Java.coreJavaPractice.Scenario_Based.SPY_AGENCY;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class spy {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String message = sc.nextLine();

        String reversed = "";
        for (int i = message.length() - 1; i >= 0; i--) {
            reversed += message.charAt(i);
        }

        System.out.println("Reversed Message: " + reversed);

        if (message.equalsIgnoreCase(reversed)) {
            System.out.println("Palindrome: Yes");
        } else {
            System.out.println("Palindrome: No");
        }

        int vowels = 0;
        int consonants = 0;

        String lower = message.toLowerCase();

        for (int i = 0; i < lower.length(); i++) {

            char ch = lower.charAt(i);

            if (Character.isLetter(ch)) {

                if (ch == 'a' || ch == 'e' || ch == 'i'
                        || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

        String msg1 = sc.nextLine();
        String msg2 = sc.nextLine();

        System.out.println("Are Anagrams? " + checkAnagram(msg1, msg2));

        String log = sc.nextLine();

        char result = firstNonRepeating(log);

        if (result == '\0') {
            System.out.println("No non-repeating character found");
        } else {
            System.out.println("First Non-Repeating Character: " + result);
        }

        sc.close();
    }

    public static boolean checkAnagram(String s1, String s2) {

        s1 = s1.replaceAll("\\s+", "").toLowerCase();
        s2 = s2.replaceAll("\\s+", "").toLowerCase();

        if (s1.length() != s2.length()) {
            return false;
        }

        int[] count = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }

        for (int value : count) {
            if (value != 0) {
                return false;
            }
        }

        return true;
    }

    public static char firstNonRepeating(String str) {

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str.toCharArray()) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }

        return '\0';
    }
}
