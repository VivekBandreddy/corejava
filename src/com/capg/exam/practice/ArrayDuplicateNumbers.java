package com.capg.exam.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDuplicateNumbers {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,1,2,3,4,5,6,6,5);

        List<Integer> uniqueList = new ArrayList<>();
        for(int i: nums){
            if(!uniqueList.contains(i)){
                uniqueList.add(i);
            }
        }
        System.out.println(uniqueList);

        //nums.stream().distinct().collect()
    }
}
