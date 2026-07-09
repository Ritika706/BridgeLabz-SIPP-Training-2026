package main.java.DSA.Scenerio_Based;

import java.util.Arrays;

public class Sorting {

    // Bubble Sort
    public static void bubbleSort(int[] arr) {

        int swaps = 0;
        boolean alreadySorted = true;

        System.out.println("Bubble Sort Passes:");

        for (int i = 0; i < arr.length - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swaps++;
                    swapped = true;
                }
            }

            System.out.println("Pass " + (i + 1) + ": " + Arrays.toString(arr));

            if (!swapped) {
                alreadySorted = true;
                break;
            } else {
                alreadySorted = false;
            }
        }

        System.out.println("Total Swaps = " + swaps);

        if (alreadySorted) {
            System.out.println("Best Case: Array was already sorted.");
        }
    }

    // Insertion Sort
    public static void insertionSort(int[] arr) {

        System.out.println("\nInsertion Sort Passes:");

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;

            System.out.println("Pass " + i + ": " + Arrays.toString(arr));
        }
    }

    // Top 3 Medalists
    public static void topThree(int[] arr) {

        Arrays.sort(arr);

        System.out.println("\nTop 3 Medalists:");
        System.out.println("Gold   : " + arr[arr.length - 1]);
        System.out.println("Silver : " + arr[arr.length - 2]);
        System.out.println("Bronze : " + arr[arr.length - 3]);
    }

    public static void main(String[] args) {

        // Example scores (replace with 50 athlete scores if needed)
        int[] scores = {64, 25, 12, 22, 11};

        int[] bubbleArray = scores.clone();
        int[] insertionArray = scores.clone();

        bubbleSort(bubbleArray);

        insertionSort(insertionArray);

        topThree(scores);
    }
}