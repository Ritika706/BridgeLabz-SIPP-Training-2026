package main.java.DSA.gcr_codebase.Sorting_Algorithms_MQC;

import java.util.Arrays;

public class MergeSortEmployeeSalaries {

    // Merge Sort Method
    public static void mergeSort(int[] salaries, int left, int right) {

        if (left < right) {

            int mid = (left + right) / 2;

            mergeSort(salaries, left, mid);
            mergeSort(salaries, mid + 1, right);

            merge(salaries, left, mid, right);
        }
    }

    // Merge Method
    public static void merge(int[] salaries, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = salaries[left + i];
        }

        for (int j = 0; j < n2; j++) {
            rightArray[j] = salaries[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {

            if (leftArray[i] <= rightArray[j]) {
                salaries[k] = leftArray[i];
                i++;
            } else {
                salaries[k] = rightArray[j];
                j++;
            }

            k++;
        }

        while (i < n1) {
            salaries[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            salaries[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {

        int[] salaries = {45000, 32000, 78000, 55000, 40000, 60000};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(salaries));

        mergeSort(salaries, 0, salaries.length - 1);

        System.out.println("\nAfter Sorting:");
        System.out.println(Arrays.toString(salaries));
    }
}
