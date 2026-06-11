package main.Java.coreJavaPractice.gcr_codebase.Arrays.LEVEL1;

import java.util.Scanner;

public class SentinelArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.println("Enter up to 10 numbers (Enter 0 or a negative number to stop early):");
        while (true) {
            if (index == 10) {
                System.out.println("Array is full (maximum 10 elements reached).");
                break;
            }

            System.out.print("Enter number: ");
            if (scanner.hasNextDouble()) {
                double entry = scanner.nextDouble();
                if (entry <= 0) {
                    break;
                }
                numbers[index] = entry;
                index++;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear token
            }
        }

        System.out.print("\nEntered Numbers: ");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
            total += numbers[i];
        }

        System.out.println("\nSum of all numbers: " + total);
        scanner.close();
    }
}