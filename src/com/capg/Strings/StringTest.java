package com.capg.Strings;

public class StringTest {

    public static void main(String[] args) {
        String s = "Tom Jerry"; //1
        String s1 = "Tom "; //2
        String s2 = "Jerry"; //3
        String s3 = "Tom " + "Jerry"; //1
        String s4 = s1 + s2; //4

        System.out.println(s == (s1 + s2)); //F
        System.out.println(s == s3); // T
        System.out.println(s == s4); //F
        System.out.println(s4 == (s1 + s2)); //F
        System.out.println(s == s.toString()); //T

    }
}
