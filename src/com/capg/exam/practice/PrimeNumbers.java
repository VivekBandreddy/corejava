package com.capg.exam.practice;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
    public static void main(String[] args) {
        int start = 20 ;
        int end =30;
        List<Integer> primeNumbersList = new ArrayList<>();
        for( ; start < end ; start++){
            int count = 0;
            for(int i = 1 ; i<start ; i++){
               // System.out.println("start : " + start  + ", i: " + i);
                if(start%i==0)
                    count++;
            }
            if(count == 1) {
                primeNumbersList.add(start);
            }
        }
        System.out.println(primeNumbersList);
    }
}
