package main.Java.coreJavaPractice.gcr_codebase.Arrays.LEVEL2;

import java.util.Scanner;

public class FriendAttributes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age for " + names[i] + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter height (in meters) for " + names[i] + ": ");
            heights[i] = scanner.nextDouble();
        }

        // Find Youngest and Tallest indices
        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        System.out.println("\n--- Analysis Result ---");
        System.out.println("Youngest friend is: " + names[youngestIndex] + " (" + ages[youngestIndex] + " years old)");
        System.out.println("Tallest friend is: " + names[tallestIndex] + " (" + heights[tallestIndex] + "m tall)");

        scanner.close();
    }
}