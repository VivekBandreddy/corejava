package com.capg.ds;

public class RadixSort {

    static int loopCount = 0;

    public static void sort(int[] arr) {
        int max = getMax(arr); // Find the maximum element

        // Perform counting sort for each digit place
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, exp);
            loopCount++;
        }
    }

    private static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            loopCount++;
        }
        return max;
    }

    private static void countingSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10]; // For digits 0-9

        // Count occurrences of each digit at the current place
        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }

        // Modify count array to store actual positions
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array (stable sort)
        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        // Copy sorted elements back to original array
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
}
