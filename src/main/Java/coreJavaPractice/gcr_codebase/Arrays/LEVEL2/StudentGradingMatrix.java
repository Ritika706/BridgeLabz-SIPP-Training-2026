package main.Java.coreJavaPractice.gcr_codebase.Arrays.LEVEL2;

import java.util.Scanner;

public class StudentGradingMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter total number of students: ");
        int count = scanner.nextInt();

        // Rows map student tracking indices, Columns map [0: Physics, 1: Chemistry, 2: Maths]
        double[][] marksMatrix = new double[count][3];
        double[] percentages = new double[count];
        String[] grades = new String[count];

        for (int i = 0; i < count; i++) {
            System.out.println("\nStudent " + (i + 1) + " Marks entry:");
            System.out.print("Physics: ");
            double phys = scanner.nextDouble();
            System.out.print("Chemistry: ");
            double chem = scanner.nextDouble();
            System.out.print("Maths: ");
            double mathVal = scanner.nextDouble();

            if (phys < 0 || chem < 0 || mathVal < 0 || phys > 100 || chem > 100 || mathVal > 100) {
                System.out.println("Invalid entry coordinates. Resetting bounds step back counts.");
                i--;
                continue;
            }

            marksMatrix[i][0] = phys;
            marksMatrix[i][1] = chem;
            marksMatrix[i][2] = mathVal;

            percentages[i] = (marksMatrix[i][0] + marksMatrix[i][1] + marksMatrix[i][2]) / 300.0 * 100.0;

            if (percentages[i] >= 80.0) grades[i] = "A";
            else if (percentages[i] >= 70.0) grades[i] = "B";
            else if (percentages[i] >= 60.0) grades[i] = "C";
            else if (percentages[i] >= 50.0) grades[i] = "D";
            else if (percentages[i] >= 40.0) grades[i] = "E";
            else grades[i] = "R (Remedial)";
        }

        System.out.println("\n================ DUAL MATRIX STUDENT TRANSCRIPT ================");
        for (int i = 0; i < count; i++) {
            System.out.printf("Student %d | Physics: %.1f | Chemistry: %.1f | Maths: %.1f | Avg Percentage: %.2f%% | Assigned Grade: %s\n",
                    (i + 1), marksMatrix[i][0], marksMatrix[i][1], marksMatrix[i][2], percentages[i], grades[i]);
        }

        scanner.close();
    }
}