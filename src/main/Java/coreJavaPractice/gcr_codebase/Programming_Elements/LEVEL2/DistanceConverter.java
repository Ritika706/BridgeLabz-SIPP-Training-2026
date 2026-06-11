package main.Java.coreJavaPractice.gcr_codebase.Programming_Elements.LEVEL2;

import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double feet = input.nextDouble();

        double yards = feet / 3;
        double miles = feet / 5280;

        System.out.println("Yards = " + yards);
        System.out.println("Miles = " + miles);

        input.close();
    }
}