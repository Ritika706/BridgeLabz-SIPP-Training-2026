package main.java.DSA.gcr_codebase.Heaps;
import java.util.*;

public class HeapifyExample {

    static void heapify(int[] arr, int n, int i) {

        int smallest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] < arr[smallest]) {
            smallest = left;
        }

        if (right < n && arr[right] < arr[smallest]) {
            smallest = right;
        }

        if (smallest != i) {
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;

            heapify(arr, n, smallest);
        }
    }

    public static void main(String[] args) {

        int[] shipments = {9, 4, 7, 1, 0, 3};

        int n = shipments.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(shipments, n, i);
        }

        System.out.println(Arrays.toString(shipments));
    }
}