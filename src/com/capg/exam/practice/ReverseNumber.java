package com.capg.exam.practice;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 123457;

        String s = String.valueOf(num);
        int[] arr = new int[s.length()];
        int j = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            arr[j] = Integer.valueOf(Character.getNumericValue(s.charAt(i)));
            j++;
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
