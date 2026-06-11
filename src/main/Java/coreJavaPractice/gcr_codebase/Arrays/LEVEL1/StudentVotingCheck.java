package main.Java.coreJavaPractice.gcr_codebase.Arrays.LEVEL1;

import java.util.Scanner;

public class StudentVotingCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] studentAges = new int[10];

        System.out.println("Enter the age of 10 students:");
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            if (scanner.hasNextInt()) {
                studentAges[i] = scanner.nextInt();
            } else {
                System.out.println("Invalid input. Defaulting to -1.");
                studentAges[i] = -1;
                scanner.next(); // Clear invalid input
            }
        }

        System.out.println("\n--- Voting Eligibility Report ---");
        for (int i = 0; i < studentAges.length; i++) {
            int age = studentAges[i];
            if (age < 0) {
                System.out.println("Invalid age.");
            } else if (age >= 18) {
                System.out.println("The student with the age " + age + " can vote.");
            } else {
                System.out.println("The student with the age " + age + " cannot vote.");
            }
        }
        scanner.close();
    }
}