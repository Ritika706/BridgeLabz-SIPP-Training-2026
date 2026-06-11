package main.Java.coreJavaPractice.Core_Java.gcr_codebase.Programming_Elements.LEVEL1;

import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter base: ");
        double base = input.nextDouble();

        System.out.print("Enter height: ");
        double height = input.nextDouble();

        double area = 0.5 * base * height;

        System.out.println("Area of Triangle = " + area);

        input.close();
    }
}