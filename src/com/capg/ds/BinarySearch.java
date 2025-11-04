package com.capg.ds;

public class BinarySearch {

    public int search(int arr[], int searchElement) {

        int start = 0;
        int end = arr.length;
        int count = 0;
        while (start < end) {
            count++;
            int mid = (start + end) / 2;
            //System.out.println(mid);
            if (searchElement == arr[mid]) {
                System.out.println(count);
                return mid;
            } else if (arr[mid] < searchElement) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[1000000000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        long startTime = System.currentTimeMillis();
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.search(arr, arr.length - 2));
        long endTime = System.currentTimeMillis();
        System.out.println("s : " + startTime + " e : " + endTime);
        System.out.println("total time : " + (endTime - startTime));
    }
}
