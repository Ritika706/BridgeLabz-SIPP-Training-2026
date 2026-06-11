package main.Java.coreJavaPractice.gcr_codebase.Arrays.LEVEL1;

import java.util.Scanner;

public class FizzBuzzArrayCache {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive boundary number: ");

        if (scanner.hasNextInt()) {
            int maxNumber = scanner.nextInt();

            if (maxNumber < 0) {
                System.out.println("Please pass a positive numerical value constraint.");
            } else {
                String[] fizzBuzzCache = new String[maxNumber + 1];

                for (int i = 0; i <= maxNumber; i++) {
                    if (i == 0) {
                        fizzBuzzCache[i] = "0";
                    } else if (i % 3 == 0 && i % 5 == 0) {
                        fizzBuzzCache[i] = "FizzBuzz";
                    } else if (i % 3 == 0) {
                        fizzBuzzCache[i] = "Fizz";
                    } else if (i % 5 == 0) {
                        fizzBuzzCache[i] = "Buzz";
                    } else {
                        fizzBuzzCache[i] = String.valueOf(i);
                    }
                }

                System.out.println("\n--- Cache Analysis Sequence Output ---");
                for (int i = 0; i <= maxNumber; i++) {
                    if (i == maxNumber) {
                        System.out.print("Position " + i + " = " + fizzBuzzCache[i]);
                    } else {
                        System.out.print("Position " + i + " = " + fizzBuzzCache[i] + ", ");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid tracking entry configuration numerical constraint.");
        }
        scanner.close();
    }
}