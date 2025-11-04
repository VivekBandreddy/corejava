package com.capg.exam.practice;

public class BalancedArray {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 3};
        //List<Integer> il = Arrays.asList(arr);
        int mid = arr.length / 2;
        System.out.println(arr.length);
        System.out.println("mid " + mid);
        int sum = 0;
        for (int i = 0; i < mid; i++) {
            System.out.println(sum + " " + arr[i]);
            sum += arr[i];
        }

        System.out.println(sum);
        if (sum == arr[mid])
            System.out.println("balanced");
    }
}
