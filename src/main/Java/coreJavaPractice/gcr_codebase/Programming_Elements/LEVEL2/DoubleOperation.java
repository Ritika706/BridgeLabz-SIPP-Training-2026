package main.Java.coreJavaPractice.gcr_codebase.Programming_Elements.LEVEL2;

import java.util.Scanner;

public class DoubleOperation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first double value: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second double value: ");
        double num2 = input.nextDouble();

        System.out.println("Addition = " + (num1 + num2));
        System.out.println("Subtraction = " + (num1 - num2));
        System.out.println("Multiplication = " + (num1 * num2));
        System.out.println("Division = " + (num1 / num2));

        input.close();
    }
}
