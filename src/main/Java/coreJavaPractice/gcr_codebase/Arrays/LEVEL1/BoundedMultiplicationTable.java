package main.Java.coreJavaPractice.gcr_codebase.Arrays.LEVEL1;

import java.util.Scanner;

public class BoundedMultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a base integer: ");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            int[] multiplicationResult = new int[4]; // Slots mapped for 6, 7, 8, 9

            for (int i = 6; i <= 9; i++) {
                multiplicationResult[i - 6] = number * i;
            }

            System.out.println("\nMultiplication Table (6 to 9):");
            for (int i = 6; i <= 9; i++) {
                System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
            }
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }
        scanner.close();
    }
}