package main.Java.coreJavaPractice.Core_Java.gcr_codebase.Programming_Elements.LEVEL2;

import java.util.Scanner;

public class SquareSideFinder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter perimeter: ");
        double perimeter = input.nextDouble();

        double side = perimeter / 4;

        System.out.println("Side of Square = " + side);

        input.close();
    }
}