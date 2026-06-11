package main.Java.coreJavaPractice.gcr_codebase.Arrays.LEVEL2;

import java.util.Scanner;

public class ZaraBonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] oldSalaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] newSalaries = new double[10];
        double[] bonusAmounts = new double[10];

        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;
        double totalBonusPayout = 0.0;

        System.out.println("Enter details for 10 employees:");
        for (int i = 0; i < 10; i++) {
            System.out.println("\nEmployee " + (i + 1) + ":");
            System.out.print("Enter Salary: ");
            double salary = scanner.nextDouble();
            System.out.print("Enter Years of Service: ");
            double years = scanner.nextDouble();

            // Validation check
            if (salary <= 0 || years < 0) {
                System.out.println("Invalid input detected! Please re-enter positive metrics for this employee.");
                i--; // Decrement index counter to retry current iteration
                continue;
            }

            oldSalaries[i] = salary;
            yearsOfService[i] = years;
        }

        // Calculation Loop
        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonusAmounts[i] = oldSalaries[i] * 0.05;
            } else {
                bonusAmounts[i] = oldSalaries[i] * 0.02;
            }

            newSalaries[i] = oldSalaries[i] + bonusAmounts[i];

            totalOldSalary += oldSalaries[i];
            totalNewSalary += newSalaries[i];
            totalBonusPayout += bonusAmounts[i];
        }

        System.out.println("\n================ ZARA PAYROLL SUMMARY ================");
        System.out.printf("Total Old Salary Payout: $%.2f\n", totalOldSalary);
        System.out.printf("Total Bonus Paid Out:    $%.2f\n", totalBonusPayout);
        System.out.printf("Total New Salary Payout: $%.2f\n", totalNewSalary);
        System.out.println("======================================================");

        scanner.close();
    }
}