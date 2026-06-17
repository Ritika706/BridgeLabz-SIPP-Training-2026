package main.Java.coreJavaPractice.Scenario_Based.WAREHOUSE_ITEMS;

import java.util.*;

public class warehouse {
    public static void analyzeStock(int[] stock) {
        if (stock == null || stock.length == 0) {
            System.out.println("Inventory is empty.");
            return;
        }

        int max = stock[0];
        int min = stock[0];
        int total = 0;

        for (int quantity : stock) {
            if (quantity > max) {
                max = quantity;
            }
            if (quantity < min) {
                min = quantity;
            }
            total += quantity;
        }

        System.out.println(max);
        System.out.println(min);
        System.out.println(total);
    }
    public static void detectDuplicates(int[] stock) {

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        boolean hasDuplicates = false;

        for (int quantity : stock) {
            if (seen.contains(quantity)) {
                duplicates.add(quantity);
                hasDuplicates = true;
            } else {
                seen.add(quantity);
            }
        }

        if (hasDuplicates) {
            System.out.println(duplicates);
        } else {
            System.out.println("No duplicate quantities detected.");
        }
    }
    public static void rotateStock(int[] stock, int k) {

        if (stock == null || stock.length == 0) return;

        int n = stock.length;
        k = k % n;

        System.out.println("Original Stock: " + Arrays.toString(stock));


        reverse(stock, 0, n - 1);

        reverse(stock, 0, k - 1);

        reverse(stock, k, n - 1);

        System.out.println("Rotated Stock (by " + k + " positions): " + Arrays.toString(stock));
    }


    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static int[][] transposeShelfGrid(int[][] grid) {
        if (grid == null || grid.length == 0) return new int[0][0];

        int rows = grid.length;
        int cols = grid[0].length;

        int[][] transposedGrid = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedGrid[j][i] = grid[i][j];
            }
        }

        return transposedGrid;
    }


    public static void printGrid(int[][] grid) {
        for (int[] row : grid) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        // Sample stock data
        int[] stockArray = {15, 42, 8, 99, 42, 23, 8};


        analyzeStock(stockArray);
        detectDuplicates(stockArray);
        rotateStock(stockArray, 3);


        int[][] shelfGrid = {
                {10, 11, 12, 13},
                {20, 21, 22, 23},
                {30, 31, 32, 33}
        };

        printGrid(shelfGrid);

        int[][] transposed = transposeShelfGrid(shelfGrid);

        printGrid(transposed);
    }
}