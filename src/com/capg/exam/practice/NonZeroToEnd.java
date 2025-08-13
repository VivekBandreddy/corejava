package com.capg.exam.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class NonZeroToEnd {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(0, 1, 0, 3, 8);
        Integer[] arr = new Integer[nums.size()];
        int endIndex = arr.length - 1;

        for (int i = 0, j = 0; i < nums.size(); i++) {
            if (nums.get(i) == 0) {
                arr[endIndex] = nums.get(i);
                endIndex--;
            } else {
                arr[j] = nums.get(i);
                j++;
            }
        }
        List<Integer> integerList = Arrays.stream(arr).collect(Collectors.toList());
        System.out.println(integerList);
    }
}
