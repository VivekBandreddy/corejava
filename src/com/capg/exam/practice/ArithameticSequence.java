package com.capg.exam.practice;

public class ArithameticSequence {
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 7};


        int i = arr.length-1;
        int previousDifference = arr[i] - arr[i-1];
        int currentDifference;
        for (; i>0 ; i--) {
            currentDifference = arr[i]-arr[i-1];
            if(previousDifference != currentDifference){
                System.out.println("Array isn't arithmetic");
                break;
            }
            previousDifference = currentDifference;
        }
        System.out.println("Array is arithmetic");
    }
}
