package com.capg.exam.practice;

public class EvenOddArraySort1 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int left = 0;
        int right = 0;

        while (right<arr.length){
            if(arr[right]%2==0){
                int temp = arr[left];
                arr[left]=arr[right];
                arr[right] = temp;
                left++;
            }
            right++;
        }


        for (int i : arr)
            System.out.print(i + " ");

    }
}