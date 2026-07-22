package main.java.DSA.gcr_codebase.BinarySearch;

import java.util.Scanner;

public class RotationPoint {

    public static int findRotationPoint(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            // Minimum is in the right half
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            }
            // Minimum is in the left half (including mid)
            else {
                right = mid;
            }
        }

        return left; // Index of the smallest element
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter rotated sorted array:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int index = findRotationPoint(arr);

        System.out.println("Rotation Point Index = " + index);
        System.out.println("Smallest Element = " + arr[index]);

        sc.close();
    }
}