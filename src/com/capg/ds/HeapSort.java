package com.capg.ds;

public class HeapSort {

    int loopCount = 0;

    public void sort(int arr[]) {
        int n = arr.length;

        // Build max heap (rearrange array)
        // Start from the last non-leaf node and heapify upwards
        for (int i = n / 2 - 1; i >= 0; i--) {
            loopCount++;
            heapify(arr, n, i);
        }

        for (int i : arr) {
            System.out.println(" " + i);
        }

        // One by one extract an element from heap
        for (int i = n - 1; i >= 0; i--) {
            loopCount++;
            // Move current root (largest element) to the end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
        System.out.println("loop count : " + loopCount);
    }

    // To heapify a subtree rooted with node i which is an index in arr[].
    // n is size of heap
    void heapify(int arr[], int n, int i) {
        loopCount++;
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1; // Left child
        int right = 2 * i + 2; // Right child

        // If left child is larger than root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // If right child is larger than largest so far
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    // Main method to test the HeapSort
    public static void main(String args[]) {
        int arr[] = {90, 20, 70, 15, 40, 30, 50, 25, 80, 60};
        HeapSort ob = new HeapSort();
        ob.sort(arr);

        System.out.println("Sorted array is");
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
