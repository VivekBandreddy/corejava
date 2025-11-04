package com.capg.java8.Collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningBy {

    public static void main(String[] args) {
        Map<Boolean, List<String>> pMap = Arrays.asList("tom", "cat", "true", "false")
                .stream().collect(Collectors.partitioningBy(s -> s.startsWith("t")));
        System.out.println(pMap); //{false=[cat, false], true=[tom, true]}
    }
}
