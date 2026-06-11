package main.Java.coreJavaPractice.gcr_codebase.Arrays.LEVEL2;

import java.util.Scanner;

public class StudentGrading1D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int count = scanner.nextInt();

        double[] physics = new double[count];
        double[] chemistry = new double[count];
        double[] maths = new double[count];
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
                System.out.println("Invalid input entry criteria! Ensure marks fall in [0 - 100] standard limit.");
                i--;
                continue;
            }

            physics[i] = phys;
            chemistry[i] = chem;
            maths[i] = mathVal;

            percentages[i] = (phys + chem + mathVal) / 300.0 * 100.0;

            if (percentages[i] >= 80.0) grades[i] = "A";
            else if (percentages[i] >= 70.0) grades[i] = "B";
            else if (percentages[i] >= 60.0) grades[i] = "C";
            else if (percentages[i] >= 50.0) grades[i] = "D";
            else if (percentages[i] >= 40.0) grades[i] = "E";
            else grades[i] = "R (Remedial)";
        }

        System.out.println("\n================ STUDENT SCORE SHEET ================");
        for (int i = 0; i < count; i++) {
            System.out.printf("Student %d | Phys: %.1f | Chem: %.1f | Maths: %.1f | Percentage: %.2f%% | Grade: %s\n",
                    (i + 1), physics[i], chemistry[i], maths[i], percentages[i], grades[i]);
        }

        scanner.close();
    }
}