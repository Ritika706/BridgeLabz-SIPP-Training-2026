package main.Java.coreJavaPractice.gcr_codebase.Arrays.LEVEL2;

import java.util.Scanner;

public class DigitFrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer input sequence: ");

        long number = scanner.nextLong();
        String numStr = String.valueOf(Math.abs(number));
        int totalDigits = numStr.length();

        int[] digits = new int[totalDigits];
        long temp = Math.abs(number);

        // Rip elements individual digits inside target index configurations
        for (int i = 0; i < totalDigits; i++) {
            digits[i] = (int) (temp % 10);
            temp /= 10;
        }

        // Define clean standard frequency baseline tracker arrays corresponding to Base 10 elements
        int[] frequencyMap = new int[10];
        for (int i = 0; i < totalDigits; i++) {
            int targetDigitValue = digits[i];
            frequencyMap[targetDigitValue]++;
        }

        System.out.println("\n--- Digit Frequency Presentation View ---");
        for (int i = 0; i < 10; i++) {
            if (frequencyMap[i] > 0) {
                System.out.println("Digit [" + i + "] occurs: " + frequencyMap[i] + " time(s)");
            }
        }

        scanner.close();
    }
}