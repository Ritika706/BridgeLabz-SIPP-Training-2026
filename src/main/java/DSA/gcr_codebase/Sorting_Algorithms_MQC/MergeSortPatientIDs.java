package main.java.DSA.gcr_codebase.Sorting_Algorithms_MQC;

import java.util.Arrays;

public class MergeSortPatientIDs {

    // Merge Sort Method
    public static void mergeSort(int[] ids, int left, int right) {

        if (left < right) {

            int mid = (left + right) / 2;

            mergeSort(ids, left, mid);
            mergeSort(ids, mid + 1, right);

            merge(ids, left, mid, right);
        }
    }

    // Merge Method
    public static void merge(int[] ids, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = ids[left + i];
        }

        for (int j = 0; j < n2; j++) {
            rightArray[j] = ids[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {

            if (leftArray[i] <= rightArray[j]) {
                ids[k] = leftArray[i];
                i++;
            } else {
                ids[k] = rightArray[j];
                j++;
            }

            k++;
        }

        while (i < n1) {
            ids[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            ids[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {

        int[] ids = {105, 101, 108, 102, 104};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(ids));

        mergeSort(ids, 0, ids.length - 1);

        System.out.println("\nAfter Sorting:");
        System.out.println(Arrays.toString(ids));
    }
}