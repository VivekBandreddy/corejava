package com.capg.java8.Collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringCollection {
    public static void main(String[] args) {
        List<String> integerList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integerList.add("" + i);
        }

        String str = integerList.stream().filter(i -> Integer.valueOf(i) % 2 == 0).collect(Collectors.joining(","));
        System.out.println(str); //0,2,4,6,8
    }
}
