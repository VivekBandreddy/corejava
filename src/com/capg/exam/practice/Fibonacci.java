package com.capg.exam.practice;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    public static int fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;

        int previousIndex = 1;
        int currentIndex = 1;
        List<Integer> integerList = new ArrayList<>();
        for (int i = 3; i <= n; i++) {
            int sum = previousIndex + currentIndex;
            previousIndex = currentIndex;
            currentIndex = sum;
            integerList.add(sum);
        }
        System.out.println(integerList);
        return integerList.getLast();
    }

    public static void main(String[] args) {
        Fibonacci.fibonacci(7);
    }
}
