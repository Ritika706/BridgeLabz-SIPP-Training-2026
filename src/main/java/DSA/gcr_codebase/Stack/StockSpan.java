package main.java.DSA.gcr_codebase.Stack;

import java.util.Stack;

public class StockSpan {

    public static void calculateSpan(int[] load) {

        int n = load.length;
        int[] span = new int[n];

        Stack<Integer> stack = new Stack<>(); // Stores indices

        stack.push(0);
        span[0] = 1;

        for (int i = 1; i < n; i++) {

            // Remove all smaller or equal previous readings
            while (!stack.isEmpty() && load[stack.peek()] <= load[i]) {
                stack.pop();
            }

            // Calculate span
            if (stack.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - stack.peek();
            }

            stack.push(i);
        }

        System.out.println("Load\tSpan");

        for (int i = 0; i < n; i++) {
            System.out.println(load[i] + "\t" + span[i]);
        }
    }

    public static void main(String[] args) {

        int[] load = {100, 80, 60, 70, 60, 75, 85};

        calculateSpan(load);
    }
}