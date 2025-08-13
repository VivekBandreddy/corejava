package com.capg.exam.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NegativeToPositive {
    public static void main(String[] args) {
        int[] arr = {1,0,2,-1,-2,-3,0,1,1,-1,4,3,0,9};
        List<Integer> integerList = new LinkedList<>();
        int negativeIndexCount = 0;
        int otherVariableCount = 0;
        for(int i : arr){
            if(i==-1){
                integerList.add(negativeIndexCount , i);
                otherVariableCount = ++negativeIndexCount;
            }
            else if(i==0){
                integerList.addLast(i);
            } else {
                integerList.add(otherVariableCount,i);
            }
        }
        System.out.println(integerList);
    }
}
