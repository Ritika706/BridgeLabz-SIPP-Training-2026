package main.Java.coreJavaPractice.gcr_codebase.Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Unchecked_Exception {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter numerator: ");
            int a = sc.nextInt();

            System.out.print("Enter denominator: ");
            int b = sc.nextInt();

            System.out.println("Result = " + (a / b));

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } catch (InputMismatchException e) {
            System.out.println("Please enter numeric values only");
        }

        sc.close();
    }
}