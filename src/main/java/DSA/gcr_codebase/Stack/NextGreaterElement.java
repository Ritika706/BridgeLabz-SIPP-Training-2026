package main.java.DSA.gcr_codebase.Stack;

import java.util.Stack;

public class NextGreaterElement {

    public static void nextGreater(int[] arr) {

        int n = arr.length;
        int[] ans = new int[n];

        Stack<Integer> stack = new Stack<>(); // Stores indices

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                int index = stack.pop();
                ans[index] = arr[i];
            }

            stack.push(i);
        }

        // Remaining elements have no greater element
        while (!stack.isEmpty()) {
            ans[stack.pop()] = -1;
        }

        System.out.println("Next Greater Elements:");

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " -> " + ans[i]);
        }
    }

    public static void main(String[] args) {

        int[] visitors = {10, 5, 8, 12, 6, 15};

        nextGreater(visitors);
    }
}