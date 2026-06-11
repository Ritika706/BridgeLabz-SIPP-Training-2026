package main.Java.coreJavaPractice.gcr_codebase.Arrays.LEVEL1;

import java.util.Scanner;

public class DynamicFactorFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            int maxFactor = 10;
            int[] factors = new int[maxFactor];
            int index = 0;

            for (int i = 1; i <= Math.abs(number); i++) {
                if (number % i == 0) {
                    // Check if current factors array is full
                    if (index == maxFactor) {
                        maxFactor = maxFactor * 2; // Double max size tracking limits
                        int[] temp = new int[maxFactor];
                        System.arraycopy(factors, 0, temp, 0, factors.length);
                        factors = temp;
                    }
                    factors[index] = i;
                    index++;
                }
            }

            System.out.print("Factors are: ");
            for (int i = 0; i < index; i++) {
                System.out.print(factors[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Invalid input element configuration.");
        }
        scanner.close();
    }
}