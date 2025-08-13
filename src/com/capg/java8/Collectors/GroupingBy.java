package com.capg.java8.Collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingBy {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple", "grape");

        // Fetch count for all strings
        Map<String, Long> stringCounts = stringList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Counts of all strings: " + stringCounts);
        //Output :  Counts of all strings: {orange=1, banana=2, apple=3, grape=1}

        //collect the string with same length
        Map<Integer, List<String>> map = stringList.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(map);
        //output : {5=[apple, apple, apple, grape], 6=[banana, orange, banana]}

        String name = "vivek";
        Map<Character, Long> characterMap = name.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(characterMap);
        //{e=1, v=2, i=1, k=1}
    }
}
