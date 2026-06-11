package main.Java.coreJavaPractice.gcr_codebase.Arrays.LEVEL1;

import java.util.Scanner;

public class MatrixFlattener {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter rows count: ");
            int rows = scanner.nextInt();
            System.out.print("Enter columns count: ");
            int columns = scanner.nextInt();

            int[][] matrix = new int[rows][columns];

            System.out.println("Populate the matrix workspace elements:");
            for (int r = 0; r < rows; r++) {
                for (int c = 0; c < columns; c++) {
                    System.out.print("Matrix[" + r + "][" + c + "]: ");
                    matrix[r][c] = scanner.nextInt();
                }
            }

            // Allocate single dimension array surface layout
            int[] flattenedArray = new int[rows * columns];
            int index = 0;

            // Matrix extraction operation utilizing nested loops
            for (int r = 0; r < rows; r++) {
                for (int c = 0; c < columns; c++) {
                    flattenedArray[index] = matrix[r][c];
                    index++;
                }
            }

            System.out.print("\nResulting 1D Flattened Array: ");
            for (int element : flattenedArray) {
                System.out.print(element + " ");
            }
            System.out.println();

        } catch (Exception e) {
            System.out.println("Error recording array sizing fields.");
        }
        scanner.close();
    }
}