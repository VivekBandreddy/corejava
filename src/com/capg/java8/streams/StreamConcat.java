package com.capg.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamConcat {

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        for (Integer i = 0; i < 5; i++) {
            l1.add(i);
            l2.add(i);
        }

        Stream<Integer> streams = Stream.concat(l1.stream(), l2.stream());

        streams.forEach(System.out::println);


    }
}
