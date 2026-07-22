package main.java.DSA.gcr_codebase.Stack;

import java.util.Stack;

public class BalancedBrackets {

    public static boolean isValid(String str) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            // Closing brackets
            else {

                // No opening bracket available
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // Stack should be empty
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        String str = "{[()]}";

        if (isValid(str))
            System.out.println("Valid Brackets");
        else
            System.out.println("Invalid Brackets");
    }
}