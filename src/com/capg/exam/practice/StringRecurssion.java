package com.capg.exam.practice;

public class StringRecurssion {
    static int count = 0;
    public static void main(String args[]) {
        String s = "abc";
        permutation(s, "");
        System.out.println(count);
    }

    public static void permutation(String s, String an) {
       // System.out.println();
        if (s.length() == 0) {
            System.out.println(an);
        }

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            String res = s.substring(0, i) + s.substring(i + 1);
            //System.out.println("ch " + ch + " res " + res);
            permutation(res, an + ch);
        }
        count++;
    }
}

