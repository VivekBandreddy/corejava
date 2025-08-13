package com.capg.exam.practice;

public class KaprekarNumber {
    public static void main(String[] args) {
        int num = 45;

        int sum = num * num;
        String s = String.valueOf(sum);
        String firstHalf = s.substring(0, s.length() / 2);
        String secondHalf = s.substring(s.length() / 2, s.length());
        System.out.println(firstHalf);
        System.out.println(secondHalf);
        int count = Integer.valueOf(firstHalf) + Integer.valueOf(secondHalf);
        System.out.println(count);
        //count == num ? "It's a Kaprekar Number" : "It's not a Kaprekar Number";
    }
}
