package com.capg.exam.practice;

import java.util.Arrays;

public class SmallestNumberAfterEach {

    public static int[] countSmaller(int[] nums) {
        int currentPosition = 0;
        int smallerElementsCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < nums[currentPosition]) {
                smallerElementsCount++;
            }
        }
        currentPosition++;
        countSmaller(Arrays.copyOfRange(nums, currentPosition, nums.length));
        System.out.println(smallerElementsCount);
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {5, 2, 6, 1};
        //op {2,1,1,0}
        countSmaller(nums);
    }


}
