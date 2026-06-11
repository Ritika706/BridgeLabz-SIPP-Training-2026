package main.Java.coreJavaPractice.Scenario_Based.KINGDOM_TAX;

import java.util.Scanner;

public class tax_system {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a citizen's income: ");
        double singleIncome = scanner.nextDouble();

        calculateAndPrintTax(singleIncome);
        System.out.println();

        double[] citizenIncomes = {8500.00, 12000.00, 45000.00, 55000.00, 3000.00, 10000.00, 50000.00, 125000.00, 9500.00, 62000.00};

        double totalTaxCollected = 0.0;


        for (int i = 0; i < citizenIncomes.length; i++) {
            double income = citizenIncomes[i];
            double tax = getTaxAmount(income);
            totalTaxCollected += tax;

            System.out.printf("Citizen %d | Income: $%9.2f | Tax: $%8.2f%n",
                    (i + 1), income, tax);
        }


        System.out.printf("TOTAL TAX COLLECTED BY THE KINGDOM: $%.2f%n", totalTaxCollected);


        scanner.close();
    }

    public static double getTaxAmount(double income) {
        if (income < 10000) {
            return income * 0.05;
        } else if (income <= 50000) {
            return income * 0.15;
        } else {
            return income * 0.30;
        }
    }

    /**
     * Helper method to identify the bracket and print data for a single citizen.
     */
    public static void calculateAndPrintTax(double income) {
        String bracket;
        double tax = getTaxAmount(income);

        if (income < 10000) {
            bracket = "Low Income (<10K) [5% Tax]";
        } else if (income <= 50000) {
            bracket = "Medium Income (10K-50K) [15% Tax]";
        } else {
            bracket = "High Income (>50K) [30% Tax]";
        }

        System.out.println("=========================================");
        System.out.printf(" Income       : $%.2f%n", income);
        System.out.printf(" Tax Bracket  : %s%n", bracket);
        System.out.printf(" Tax Amount   : $%.2f%n", tax);
        System.out.println("=========================================");
    }
}