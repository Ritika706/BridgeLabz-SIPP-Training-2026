package main.java.DSA.gcr_codebase.Sorting_Algorithms_BSI;

import java.util.Arrays;

public class InsertionSortEmployeeIDs {

    // Insertion Sort Method
    public static void insertionSort(int[] employeeIds) {

        int n = employeeIds.length;

        for (int i = 1; i < n; i++) {

            int key = employeeIds[i];
            int j = i - 1;

            // Shift elements greater than key
            while (j >= 0 && employeeIds[j] > key) {
                employeeIds[j + 1] = employeeIds[j];
                j--;
            }

            employeeIds[j + 1] = key;

            // Display array after each pass
            System.out.println("Pass " + i + ": " + Arrays.toString(employeeIds));
        }
    }

    public static void main(String[] args) {

        int[] employeeIds = {105, 101, 104, 102, 103};

        System.out.println("Original Employee IDs:");
        System.out.println(Arrays.toString(employeeIds));

        insertionSort(employeeIds);

        System.out.println("\nSorted Employee IDs:");
        System.out.println(Arrays.toString(employeeIds));
    }
}