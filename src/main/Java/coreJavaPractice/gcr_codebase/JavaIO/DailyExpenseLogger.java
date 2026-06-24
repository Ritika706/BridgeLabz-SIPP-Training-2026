package main.Java.coreJavaPractice.gcr_codebase.JavaIO;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DailyExpenseLogger {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter category: ");
        String category = sc.nextLine();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        try (FileWriter writer = new FileWriter("expenses.txt", true)) {

            writer.write(category + " - " + amount + "\n");

            System.out.println("Expense saved");

        } catch (IOException e) {
            System.out.println("Error writing to file");
        }

        sc.close();
    }
}