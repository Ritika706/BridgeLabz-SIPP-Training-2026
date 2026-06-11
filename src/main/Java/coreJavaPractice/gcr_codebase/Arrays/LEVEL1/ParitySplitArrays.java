package main.Java.coreJavaPractice.gcr_codebase.Arrays.LEVEL1;

import java.util.Scanner;

public class ParitySplitArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number limit: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Error: Input is not an integer.");
            scanner.close();
            return;
        }

        int number = scanner.nextInt();
        if (number <= 0) {
            System.out.println("Error: Not a Natural Number. Program exiting.");
            scanner.close();
            return;
        }

        int size = (number / 2) + 1;
        int[] evenArray = new int[size];
        int[] oddArray = new int[size];

        int evenIndex = 0;
        int oddIndex = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenArray[evenIndex] = i;
                evenIndex++;
            } else {
                oddArray[oddIndex] = i;
                oddIndex++;
            }
        }

        System.out.print("Odd numbers array: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddArray[i] + " ");
        }

        System.out.print("\nEven numbers array: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenArray[i] + " ");
        }
        System.out.println();
        scanner.close();
    }
}