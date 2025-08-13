package com.capg.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamRefactoring {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<String> upperNames = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperNames);
        //[ALICE, BOB, CHARLIE]
    }
}
