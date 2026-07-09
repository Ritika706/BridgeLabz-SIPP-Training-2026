package main.java.DSA.gcr_codebase.Sorting_Algorithms_MQC;

import java.util.Arrays;

public class MergeSortCustomerOrders {

    // Merge Sort Method
    public static void mergeSort(int[] orders, int left, int right) {

        if (left < right) {

            int mid = (left + right) / 2;

            mergeSort(orders, left, mid);
            mergeSort(orders, mid + 1, right);

            merge(orders, left, mid, right);
        }
    }

    // Merge Method
    public static void merge(int[] orders, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = orders[left + i];
        }

        for (int j = 0; j < n2; j++) {
            rightArray[j] = orders[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {

            if (leftArray[i] <= rightArray[j]) {
                orders[k] = leftArray[i];
                i++;
            } else {
                orders[k] = rightArray[j];
                j++;
            }

            k++;
        }

        while (i < n1) {
            orders[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            orders[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {

        int[] orders = {850, 420, 1200, 650, 300};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(orders));

        mergeSort(orders, 0, orders.length - 1);

        System.out.println("\nAfter Sorting:");
        System.out.println(Arrays.toString(orders));
    }
}