package com.capg.exam.practice;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FruitPicking {
    public static void main(String[] args) {
        int[] fruits = {1, 2, 3, 2, 2};
        //4
        Map<Integer, Long> map =
                Arrays.stream(fruits).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(map);
        System.out.println(map.values());
        System.out.println(map.values().stream().sorted().collect(Collectors.toList()).reversed().stream().limit(2).mapToLong(Long::longValue).sum());

    }
}
