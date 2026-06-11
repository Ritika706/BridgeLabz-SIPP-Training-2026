package main.Java.coreJavaPractice.gcr_codebase.Arrays.LEVEL1;

import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Element " + i + ": ");
            while (!scanner.hasNextInt()) {
                System.out.print("Please enter a valid integer: ");
                scanner.next();
            }
            numbers[i] = scanner.nextInt();
        }

        System.out.println("\n--- Number Analysis ---");
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is positive and even");
                } else {
                    System.out.println(num + " is positive and odd");
                }
            } else if (num < 0) {
                System.out.println(num + " is negative");
            } else {
                System.out.println(num + " is zero");
            }
        }

        System.out.println("\n--- Boundary Analysis ---");
        int first = numbers[0];
        int last = numbers[numbers.length - 1];
        System.out.println("First element: " + first + ", Last element: " + last);

        if (first == last) {
            System.out.println("They are equal");
        } else if (first > last) {
            System.out.println("First element is greater than the last element");
        } else {
            System.out.println("First element is less than the last element");
        }
        scanner.close();
    }
}