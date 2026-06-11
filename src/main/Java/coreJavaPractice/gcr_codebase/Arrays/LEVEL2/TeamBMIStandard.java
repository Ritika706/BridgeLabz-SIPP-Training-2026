package main.Java.coreJavaPractice.gcr_codebase.Arrays.LEVEL2;

import java.util.Scanner;

public class TeamBMIStandard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of persons in team: ");
        int count = scanner.nextInt();

        double[] weights = new double[count];
        double[] heights = new double[count];
        double[] bmis = new double[count];
        String[] statuses = new String[count];

        for (int i = 0; i < count; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.print("Enter Weight (in kg): ");
            weights[i] = scanner.nextDouble();
            System.out.print("Enter Height (in cm): ");
            heights[i] = scanner.nextDouble();

            // Formula calculation phase
            double heightMeters = heights[i] / 100.0;
            bmis[i] = weights[i] / (heightMeters * heightMeters);

            if (bmis[i] <= 18.4) {
                statuses[i] = "Underweight";
            } else if (bmis[i] <= 24.9) {
                statuses[i] = "Normal weight";
            } else if (bmis[i] <= 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }

        System.out.println("\n================ TEAM BMI REPORT ================");
        for (int i = 0; i < count; i++) {
            System.out.printf("Individual %d | Height: %.1fcm | Weight: %.1fkg | BMI: %.2f | Status: %s\n",
                    (i + 1), heights[i], weights[i], bmis[i], statuses[i]);
        }

        scanner.close();
    }
}