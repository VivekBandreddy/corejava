package com.capg.exam.practice;

import java.util.*;

public class LargestProduct {
    public static void main(String[] args) {
        //input : [-2, -3, 0, -2, -40] op : 80
        List<Integer> list = Arrays.asList(-2, -3, 0, -2, -40);
        List<Integer> sumList = new ArrayList<>();
        int currentPosition = 0;
        for (int i = 1; i < list.size(); i++) {
            sumList.add(list.get(currentPosition) * list.get(i));
            currentPosition++;
        }
        Optional<Integer> sum = sumList.stream().max(Comparator.naturalOrder());
        System.out.println(sum.get());

    }
}
