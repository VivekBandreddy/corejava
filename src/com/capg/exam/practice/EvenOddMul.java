package com.capg.exam.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOddMul {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(2, 3, 7, 5, 4, 8, 6);

        List<Integer> result = integerList.stream().map(i -> {
            if (i % 2 == 0) {
                return i * 3;
            } else
                return i + 1;
        }).collect(Collectors.toList());

        System.out.println(result);
    }
}
