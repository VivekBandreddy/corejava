package com.capg.ds;

import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < 10; i++) {
            stack.push(i); //pushes element at top
            if (i % 2 == 0)
                stack.pop(); //removes top index elements
        }
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.search(1));
        System.out.println(stack.search(9));
    }
}
