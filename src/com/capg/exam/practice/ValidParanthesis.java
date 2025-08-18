package com.capg.exam.practice;

import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        String s = "{[]}";
        Stack<Character> stack = new Stack<>();

        if (s.length() % 2 != 0) {
            System.out.println("false");
        }

        for (char c : s.toCharArray()) {

            if ('{' == c || '[' == c || '(' == c) stack.push(c);
            else if (c == '}' || ']' == c || ')' == c) {
                if (stack.isEmpty()) {
                    System.out.println("false");
                }

                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    System.out.println("false"); // Mismatch
                }
            }
        }
    }
}
