package com.capg.java8.intermediateoperators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperations {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            integerList.add(i);

        System.out.println("Full list : " + integerList);
        //Full list : [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        //filter
        System.out.println("filteredList  : ");
        integerList.stream().filter(i -> i % 2 == 0).forEach(System.out::print);
        //02468

        //distinct
        integerList.add(9);
        System.out.println("Full list : " + integerList);
        //Full list : [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 9]
        integerList.stream().distinct().forEach(System.out::print);
        //0123456789

        //limit
        System.out.println("Performing limit operation : ");
        integerList.stream().filter(i -> i % 2 == 0).limit(3).forEach(System.out::print);
        System.out.println();
        //024

        //map
        System.out.println("Performing map operation : ");
        integerList.stream().map(i -> i * i).forEach(System.out::print);
        //0 1 4 9 16 25 36 49 64 81 81

        System.out.println();
        //flatmap
        List<List<Integer>> flatmap =Arrays.asList(integerList , integerList);
        List<Integer> flatMapResult = flatmap.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(flatMapResult);
        //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 9]

        System.out.println(integerList);
        System.out.println("Skip functionality");
        integerList.stream().sorted(Comparator.reverseOrder()).skip(2).forEach(System.out::print);
    }
}
