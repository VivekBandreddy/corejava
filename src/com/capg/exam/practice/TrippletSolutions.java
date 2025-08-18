package com.capg.exam.practice;

public class TrippletSolutions {

    public static void main(String[] args) {
        int[] arr = {-3, -2, -1, 1, 2, -1, -4};
        System.out.println(findTriplets(arr));
    }

    public static boolean findTriplets(int[] arr) {

        boolean istripplet = false;
        int pivot = 0;
        int currentPosition = 1;
        for (int i = 2; i < arr.length; i++) {
            if (arr[pivot] + arr[currentPosition] + arr[i] == 0)
                return true;

            currentPosition++;
        }
        return istripplet;
    }
}
