package com.capg.exam.practice;

public class SpongeCase {
    public static void main(String[] args) {
        String input = "java programming";
        int count = 0;
        StringBuffer sb = new StringBuffer();
        for (char c : input.toCharArray()) {
            if (count % 2 != 0)
                sb.append(Character.toUpperCase(c));
            else
                sb.append(c);

            count++;
        }

        System.out.println(sb.toString());

    }
}
