package com.capg.exam.practice;

import java.util.Stack;

public class RemoveReccuringCharacters {
    public static void main(String[] args) {
        String input = "abbbaaca";
        //abbaca
        //aaca
        //ca
        char[] chars = input.toCharArray();
        int i = 0;
        int length = input.length();
        Stack<Character> stack = new Stack<>();
        stack.push(chars[i]);
        for (; i < length; ++i) {
            if (!stack.isEmpty() && stack.peek() == chars[i])
                stack.pop();
            else if (chars[i - 1] != chars[i])
                stack.push(chars[i]);
        }

        System.out.println(stack);
    }
}
