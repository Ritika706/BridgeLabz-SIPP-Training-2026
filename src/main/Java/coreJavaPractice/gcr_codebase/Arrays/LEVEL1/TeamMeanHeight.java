package main.Java.coreJavaPractice.gcr_codebase.Arrays.LEVEL1;

import java.util.Scanner;

public class TeamMeanHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0.0;

        System.out.println("Enter the heights of 11 football players (in cm):");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            if (scanner.hasNextDouble()) {
                heights[i] = scanner.nextDouble();
                sum += heights[i];
            } else {
                System.out.println("Invalid metric data. Re-enter value for current player.");
                scanner.next();
                i--; // Step back loop iteration counter index
            }
        }

        double mean = sum / 11;
        System.out.printf("\nThe mean height of the football team is: %.2f cm\n", mean);
        scanner.close();
    }
}