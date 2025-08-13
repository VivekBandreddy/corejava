package com.capg.exam.practice;

import java.util.Arrays;

public class ArrayMountain {

    public static void main(String[] args) {
        int arr[] = {0, 3, 5, 6, 5, 10, 8, 6, 3};
        int mid = arr.length / 2;
        boolean isMountain = true;
        System.out.println(mid);
        int j = arr.length;
        j--;
        for (int i = 0; i < mid; i++, j--) {
            System.out.println(arr[i] + " " + arr[i + 1] + " " + !(arr[i] < arr[i + 1]));
            if (!(arr[i] < arr[i + 1]) || !(arr[j] < arr[j - 1])) {
                System.out.println("inside loop : " + i);
                isMountain = false;
                break;
            }
        }

        System.out.println(isMountain);

        int maxNumber = Arrays.stream(arr).max().getAsInt();
        System.out.println(maxNumber);
    }
}
