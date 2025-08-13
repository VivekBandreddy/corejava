package com.capg.exam.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RangesAscendingOrder {
    public static void main(String[] args) {
        int[] nums = //{0,1,2,4,5,7};
                {0, 2, 3, 4, 6, 8, 9};
        int length = nums.length;
        List<String> rangeList = new ArrayList<>();

        for (int i = 0; i < length;) {
            int nextConsequtiveNumber = nums[i];
            int temp = 0;
            int j = i + 1;
            if (j < length && nums[i] + 1 == nums[j]) {
                nextConsequtiveNumber = nums[j];
                temp++;
                j++;
                int[] subArray = Arrays.copyOfRange(nums, j, length);
                for (int k : subArray) {
                    if (nextConsequtiveNumber + 1 == k) {
                        nextConsequtiveNumber = k;
                        j++;
                    }else
                        break;
                }
            }
            if (temp != 0){
                rangeList.add(nums[i] + "->" + nextConsequtiveNumber);
                //j++;
            }
            else{
                rangeList.add(String.valueOf(nums[i]));
            }

            if(j < length && temp!=0){
                nextConsequtiveNumber = nums[j];
            }
            i = j;
        }

        System.out.println(rangeList);
        //Expected Result
        //["0", "2->4", "6", "8->9"]
    }
}
