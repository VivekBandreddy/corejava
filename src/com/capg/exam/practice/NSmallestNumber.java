package com.capg.exam.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NSmallestNumber {
    public static void main(String[] args) {
        int m = 3;
        int[] arr = {4, 2, 7, 1, 3};
        List<Integer> integerList = Arrays.stream(arr).boxed().collect(Collectors.toList());
        integerList.sort(null);
        System.out.println(integerList.get(m - 1));
    }
}
