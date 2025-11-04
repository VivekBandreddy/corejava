package com.capg.exam.practice;

import java.util.Arrays;

public class StringSorting {

    public static String rearrangeString(String str) {
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }

    public static void main(String[] args) {
        System.out.println(rearrangeString("programming"));

    }
}
