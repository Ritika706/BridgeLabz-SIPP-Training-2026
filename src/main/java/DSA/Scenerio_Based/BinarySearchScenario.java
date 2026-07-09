package main.java.DSA.Scenerio_Based;

public class BinarySearchScenario {

    // 1. Binary Search
    static int binarySearch(int[] arr, int target) {

        int low = 0, high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == target)
                return mid;

            if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }

    // 2. Search in Rotated Sorted Array
    static int searchRotated(int[] arr, int target) {

        int low = 0, high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == target)
                return mid;

            // Left half sorted
            if (arr[low] <= arr[mid]) {

                if (target >= arr[low] && target < arr[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            }
            // Right half sorted
            else {

                if (target > arr[mid] && target <= arr[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }

        return -1;
    }

    // 3. First Occurrence
    static int firstOccurrence(int[] arr, int target) {

        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                ans = mid;
                high = mid - 1;
            } else if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return ans;
    }

    // 4. Last Occurrence
    static int lastOccurrence(int[] arr, int target) {

        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                ans = mid;
                low = mid + 1;
            } else if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return ans;
    }

    // 5. Find Minimum in Rotated Sorted Array
    static int findMinimum(int[] arr) {

        int low = 0, high = arr.length - 1;

        while (low < high) {

            int mid = (low + high) / 2;

            if (arr[mid] > arr[high])
                low = mid + 1;
            else
                high = mid;
        }

        return arr[low];
    }

    public static void main(String[] args) {

        // Binary Search
        int[] stars = {5, 10, 15, 20, 25, 30, 35, 40};

        System.out.println("Binary Search:");
        System.out.println("Brightness 25 found at index = "
                + binarySearch(stars, 25));

        // Rotated Search
        int[] rotated = {30, 35, 40, 5, 10, 15, 20, 25};

        System.out.println("\nSearch in Rotated Array:");
        System.out.println("Brightness 15 found at index = "
                + searchRotated(rotated, 15));

        // First & Last Occurrence
        int[] repeated = {5, 10, 10, 10, 15, 20, 20, 25};

        System.out.println("\nFirst Occurrence of 10 = "
                + firstOccurrence(repeated, 10));

        System.out.println("Last Occurrence of 10 = "
                + lastOccurrence(repeated, 10));

        // Minimum Element
        System.out.println("\nMinimum Brightness = "
                + findMinimum(rotated));
    }
}