package com.capg.exam.practice;

import java.util.HashMap;
import java.util.Map;

public class PronicNumberCheck {

    public static void main(String[] args) {
        int number = 6;
        Map<Integer, Integer> pronicMap = new HashMap<>();
        for (int i = 1; i < number; i++) {
            for (int j = i + 1; j < number; j++) {
                if (i * j == number)
                    pronicMap.put(i, j);
            }
        }

        System.out.println(pronicMap);

        boolean isPronicMap = pronicMap.entrySet().stream().anyMatch(e -> e.getKey() + 1 == pronicMap.get(e.getKey()));
    System.out.println(isPronicMap);
    }
}
