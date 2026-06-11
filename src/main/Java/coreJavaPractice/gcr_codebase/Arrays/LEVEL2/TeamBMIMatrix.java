package main.Java.coreJavaPractice.gcr_codebase.Arrays.LEVEL2;

import java.util.Scanner;

public class TeamBMIMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of persons in team: ");
        int count = scanner.nextInt();

        double[][] personData = new double[count][3]; // index 0: weight, index 1: height, index 2: bmi
        String[] weightStatus = new String[count];

        for (int i = 0; i < count; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.print("Enter Weight (in kg): ");
            double weight = scanner.nextDouble();
            System.out.print("Enter Height (in cm): ");
            double height = scanner.nextDouble();

            if (weight <= 0 || height <= 0) {
                System.out.println("Invalid numeric parameters! Values must be strictly positive entries.");
                i--; // Step back loop counter index profile values
                continue;
            }

            personData[i][0] = weight;
            personData[i][1] = height;

            double heightMeters = height / 100.0;
            personData[i][2] = weight / (heightMeters * heightMeters);

            double bmiVal = personData[i][2];
            if (bmiVal <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmiVal <= 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmiVal <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\n================ TEAM BMI REPORT (MATRIX VIEW) ================");
        for (int i = 0; i < count; i++) {
            System.out.printf("Individual %d | Weight: %.1fkg | Height: %.1fcm | BMI: %.2f | Status: %s\n",
                    (i + 1), personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        scanner.close();
    }
}
