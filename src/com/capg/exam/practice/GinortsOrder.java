package com.capg.exam.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class GinortsOrder {
    public static void main(String[] args) {




        String inputString = "Zebra1234";
        char[] arr = inputString.toCharArray();
        Arrays.sort(arr);
        String s = new String(arr);
        System.out.println(s);

        StringBuilder smallLetters = new StringBuilder();
        StringBuilder capitalLetters = new StringBuilder();
        StringBuilder oddNumbers = new StringBuilder();
        StringBuilder evenNumbers = new StringBuilder();
        for (char c : arr) {
           // System.out.println(c);
            if (c >= 97 && c <= 122) {
                smallLetters.append(c);
            } else if (c >= 65 && c <= 90) {
                capitalLetters.append(c);
            } else if (Character.getNumericValue(c) % 2 == 0) {
                evenNumbers.append(c);
            } else if (Character.getNumericValue(c) % 2 != 0) {
                oddNumbers.append(c);
            }
        }
        StringBuilder finalString = new StringBuilder();
        finalString.append(smallLetters).append(capitalLetters).append(oddNumbers).append(evenNumbers);

        System.out.println(finalString.toString());
    }
}
