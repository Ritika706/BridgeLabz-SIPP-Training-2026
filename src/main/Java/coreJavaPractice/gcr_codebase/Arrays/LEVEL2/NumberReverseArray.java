package main.Java.coreJavaPractice.gcr_codebase.Arrays.LEVEL2;

import java.util.Scanner;

public class NumberReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        long number = scanner.nextLong();
        String numStr = String.valueOf(Math.abs(number));
        int totalDigits = numStr.length();

        int[] digits = new int[totalDigits];
        long temp = Math.abs(number);

        // Fill base digits array
        for (int i = 0; i < totalDigits; i++) {
            digits[i] = (int) (temp % 10);
            temp /= 10;
        }

        // Move into inverse mapping array workspace
        int[] reversedDigits = new int[totalDigits];
        for (int i = 0; i < totalDigits; i++) {
            reversedDigits[i] = digits[i];
        }

        System.out.print("Reversed digit presentation array view: ");
        for (int i = 0; i < totalDigits; i++) {
            System.out.print(reversedDigits[i]);
        }
        System.out.println();

        scanner.close();
    }
}