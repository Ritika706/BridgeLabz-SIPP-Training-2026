package main.Java.coreJavaPractice.Core_Java.gcr_codebase.Programming_Elements;

import java.util.Scanner;

public class SquareSideCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter perimeter: ");
        double perimeter = input.nextDouble();

        double side = perimeter / 4;

        System.out.println("The length of the side is "
                + side +
                " whose perimeter is "
                + perimeter);

        input.close();
    }
}