package main.Java.coreJavaPractice.gcr_codebase.Programming_Elements.LEVEL1;

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