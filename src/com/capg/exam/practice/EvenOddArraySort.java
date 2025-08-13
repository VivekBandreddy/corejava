package com.capg.exam.practice;

public class EvenOddArraySort {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int beginIndex = 0;
        int endIndex = arr.length - 1;
        int startIndex = 0;
        int temp = 0;
        for (int i : arr) {
            System.out.println("i " + i);
            if (i % 2 == 0) {
                temp = arr[beginIndex];
                arr[beginIndex] = i;
                arr[startIndex] = temp;
                beginIndex++;
            }
            startIndex++;

        }

        for (int i : arr)
            System.out.print(i + " ");

    }
}