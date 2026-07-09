package main.java.DSA.gcr_codebase.Sorting_Algorithms_BSI;

import java.util.Arrays;

public class SelectionSortExamScores {

    // Selection Sort Method
    public static void selectionSort(int[] scores) {

        int n = scores.length;

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            // Find the minimum element
            for (int j = i + 1; j < n; j++) {

                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap
            int temp = scores[i];
            scores[i] = scores[minIndex];
            scores[minIndex] = temp;

            // Display array after each pass
            System.out.println("Pass " + (i + 1) + ": " + Arrays.toString(scores));
        }
    }

    public static void main(String[] args) {

        int[] scores = {88, 72, 95, 60, 81};

        System.out.println("Original Exam Scores:");
        System.out.println(Arrays.toString(scores));

        selectionSort(scores);

        System.out.println("\nSorted Exam Scores:");
        System.out.println(Arrays.toString(scores));
    }
}