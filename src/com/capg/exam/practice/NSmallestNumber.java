package com.capg.exam.practice;

import java.util.Arrays;

public class NSmallestNumber {
    public static void main(String[] args) {
        int m = 3;
        int[] arr = {4, 2, 7, 1, 3};
        int[] brr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr);
        System.out.println(arr[m - 1]);
    }
}
