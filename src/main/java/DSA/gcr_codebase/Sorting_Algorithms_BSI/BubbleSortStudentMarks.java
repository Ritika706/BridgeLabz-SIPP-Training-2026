package main.java.DSA.gcr_codebase.Sorting_Algorithms_BSI;

import java.util.Arrays;

public class BubbleSortStudentMarks {

    // Bubble Sort Method
    public static void bubbleSort(int[] marks) {

        int n = marks.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {

            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                if (marks[j] > marks[j + 1]) {

                    // Swap
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;

                    swapped = true;
                }
            }

            // Display array after each pass
            System.out.println("Pass " + (i + 1) + ": " + Arrays.toString(marks));

            // Best case: Already sorted
            if (!swapped) {
                System.out.println("Array is already sorted.");
                break;
            }
        }
    }

    public static void main(String[] args) {

        int[] marks = {78, 45, 90, 67, 82};

        System.out.println("Original Marks:");
        System.out.println(Arrays.toString(marks));

        bubbleSort(marks);

        System.out.println("\nSorted Marks:");
        System.out.println(Arrays.toString(marks));
    }
}