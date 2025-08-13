package com.capg.exam.practice;

public class StringIteration {

    public static void main(String[] args) {
        String str = "abc";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            StringBuffer sb = new StringBuffer();
            StringBuffer sb1 = new StringBuffer();

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) != str.charAt(j)) {
                    sb1 = sb.append(str.charAt(j));
                }
                count++;
            }
            // sb.append(str.charAt(i)).append(sb1).append("\n");
            // sb.append(str.charAt(i)).append(sb1.reverse());
            System.out.println(str.charAt(i) + sb1.toString());
            System.out.println(str.charAt(i) + sb1.reverse().toString());

        }
        System.out.println(count);

    }
}
