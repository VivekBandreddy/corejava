package com.capg.java8.primitivestreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class PrimitiveStreams {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            integerList.add(i);


        //integerList.stream().min(System.out::print);

        IntStream minStream = IntStream.of(10, 20, 30, 40);
        System.out.println(minStream.min());
        IntStream avgStream = IntStream.of(10, 20, 30, 40);
        System.out.println(avgStream.average());
        IntStream maxStream = IntStream.of(10, 20, 30, 999999);
        System.out.println(maxStream.max());
    }
}
