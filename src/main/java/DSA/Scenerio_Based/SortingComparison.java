package main.java.DSA.Scenerio_Based;

import java.util.Arrays;
import java.util.Random;

public class SortingComparison {

    // ---------------- Merge Sort ----------------

    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    static void merge(int[] arr, int left, int mid, int right) {

        int[] leftArr = Arrays.copyOfRange(arr, left, mid + 1);
        int[] rightArr = Arrays.copyOfRange(arr, mid + 1, right + 1);

        int i = 0, j = 0, k = left;

        while (i < leftArr.length && j < rightArr.length) {

            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }

        while (i < leftArr.length)
            arr[k++] = leftArr[i++];

        while (j < rightArr.length)
            arr[k++] = rightArr[j++];
    }

    // ---------------- Quick Sort (Lomuto Partition) ----------------

    static void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            int pivot = partition(arr, low, high);

            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];

        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] <= pivot) {

                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // ---------------- Counting Sort ----------------

    static void countingSort(int[] arr, int maxValue) {

        int[] count = new int[maxValue + 1];

        for (int num : arr)
            count[num]++;

        int index = 0;

        for (int i = 0; i <= maxValue; i++) {

            while (count[i]-- > 0) {
                arr[index++] = i;
            }
        }
    }

    // ---------------- Runtime Comparison ----------------

    static void compare(int size) {

        Random random = new Random();

        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        int[] arr3 = new int[size];

        for (int i = 0; i < size; i++) {

            int value = random.nextInt(20) + 1; // Genre codes 1-20

            arr1[i] = value;
            arr2[i] = value;
            arr3[i] = value;
        }

        long start, end;

        start = System.nanoTime();
        mergeSort(arr1, 0, arr1.length - 1);
        end = System.nanoTime();

        System.out.println("Merge Sort (" + size + ") : " + (end - start) + " ns");

        start = System.nanoTime();
        quickSort(arr2, 0, arr2.length - 1);
        end = System.nanoTime();

        System.out.println("Quick Sort (" + size + ") : " + (end - start) + " ns");

        start = System.nanoTime();
        countingSort(arr3, 20);
        end = System.nanoTime();

        System.out.println("Counting Sort (" + size + ") : " + (end - start) + " ns");

        System.out.println();
    }

    // ---------------- Main ----------------

    public static void main(String[] args) {

        int[] demo = {9, 4, 7, 2, 6, 1, 8};

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(demo));

        mergeSort(demo, 0, demo.length - 1);

        System.out.println("\nAfter Merge Sort:");
        System.out.println(Arrays.toString(demo));

        System.out.println("\nMerge Sort Complexity = O(n log n)");

        System.out.println("\nRuntime Comparison");
        compare(100);
        compare(1000);
        compare(10000);
    }
}
