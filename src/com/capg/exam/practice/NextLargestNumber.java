package com.capg.exam.practice;

import java.util.Arrays;

public class NextLargestNumber {

    public int findNextLargestNumber(int number) {
        String actaulValue = String.valueOf(number);
        char sortedArray[] = actaulValue.toCharArray();
        char[] actualArray = actaulValue.toCharArray();
        char[] modified = new char[sortedArray.length];
        int length = sortedArray.length - 1;
        System.out.println(length);
       /* if(ch[length] > ch[length-1]){
            char temp = ch[length];
            ch[length] = ch[length-1];
            ch[length-1] = temp;
            return Integer.valueOf(String.valueOf(ch));
        }*/
        Arrays.sort(sortedArray);
        System.out.println(sortedArray);
        int index = Arrays.binarySearch(sortedArray, actaulValue.charAt(length));
        System.out.println("last char  index : " + index);
        for (int i = length; i >= 0; i--) {
            int val = Arrays.binarySearch(sortedArray, actaulValue.charAt(i));
            if (i + val != 0) {
                char temp = actualArray[i];
                actualArray[i] = actualArray[val + 1];
                actualArray[val + 1] = temp;
                return Integer.valueOf(String.valueOf(actualArray));
            }
        }


        return -1;
    }

    public static void main(String[] args) {
        //int number = 1234;
        int number = 35421;
        NextLargestNumber nextLargestNumber = new NextLargestNumber();
        System.out.println("result : " + nextLargestNumber.findNextLargestNumber(number));

    }
}
