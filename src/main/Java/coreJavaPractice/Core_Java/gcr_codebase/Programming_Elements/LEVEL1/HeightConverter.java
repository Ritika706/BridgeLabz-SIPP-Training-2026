package main.Java.coreJavaPractice.Core_Java.gcr_codebase.Programming_Elements.LEVEL1;

import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter height in cm: ");
        double heightCm = input.nextDouble();

        double totalInches = heightCm / 2.54;
        double feet = totalInches / 12;

        System.out.println("Your Height in cm is " +
                heightCm +
                " while in feet is " +
                feet +
                " and inches is " +
                totalInches);

        input.close();
    }
}