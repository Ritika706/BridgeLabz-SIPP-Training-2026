package main.java.DSA.gcr_codebase.BinarySearch;

import java.util.Scanner;

public class PeakElement {

    public static int findPeak(int[] arr) {

        int n = arr.length;

        // If only one element
        if (n == 1)
            return 0;

        // First element is peak
        if (arr[0] > arr[1])
            return 0;

        // Last element is peak
        if (arr[n - 1] > arr[n - 2])
            return n - 1;

        int left = 1;
        int right = n - 2;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            // Peak found
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // Peak is on the left side
            else if (arr[mid] < arr[mid - 1]) {
                right = mid - 1;
            }

            // Peak is on the right side
            else {
                left = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int index = findPeak(arr);

        System.out.println("Peak Element Index = " + index);
        System.out.println("Peak Element = " + arr[index]);

        sc.close();
    }
}