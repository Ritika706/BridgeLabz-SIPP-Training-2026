package main.Java.coreJavaPractice.gcr_codebase.Arrays.LEVEL2;

import java.util.Scanner;

public class DigitExtremesDynamic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        long number = scanner.nextLong();
        long tempNumber = Math.abs(number);

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        if (tempNumber == 0) {
            digits[index++] = 0;
        } else {
            while (tempNumber != 0) {
                if (index == maxDigit) {
                    maxDigit += 10; // Increase max threshold tracking bounds by 10 slots
                    int[] tempArray = new int[maxDigit];
                    System.arraycopy(digits, 0, tempArray, 0, digits.length);
                    digits = tempArray;
                }
                digits[index] = (int) (tempNumber % 10);
                index++;
                tempNumber /= 10;
            }
        }

        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < index; i++) {
            int d = digits[i];
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }

        System.out.println("Largest Digit: " + largest);
        System.out.println("Second Largest Digit: " + secondLargest);

        scanner.close();
    }
}