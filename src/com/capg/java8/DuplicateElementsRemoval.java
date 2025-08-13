package com.capg.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateElementsRemoval {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(0, 0, 1, 2, 34, 5, 5, 0, 1, 3, 4, 5);
        System.out.println(integerList.stream().distinct().collect(Collectors.toList()));
        //[0, 1, 2, 34, 5, 3, 4]

        String input = "vivek";
        System.out.println(input.chars().distinct().mapToObj(c -> (char) c).collect(Collectors.toList()));
        //[v, i, e, k]
        // List<String> charInput = Arrays.asList(ch);

    }
}
