package main.Java.coreJavaPractice.gcr_codebase.Arrays.LEVEL1;

import java.util.Scanner;

public class FullMultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            int[] multiplicationTable = new int[10];

            for (int i = 1; i <= 10; i++) {
                multiplicationTable[i - 1] = number * i;
            }

            System.out.println("\nMultiplication Table for " + number + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " * " + i + " = " + multiplicationTable[i - 1]);
            }
        } else {
            System.out.println("Invalid entry. Please enter an integer.");
        }
        scanner.close();
    }
}