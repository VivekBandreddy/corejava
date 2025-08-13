package com.capg.java8.Collectors;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToMap {

    public static void main(String[] args) {
        Map<Integer, String> map = Stream.of("App", "map", "apple", "android", "ball").
                collect(Collectors.toMap(s -> s.length(), //key
                        s -> s,//value
                        (s1, s2) -> s1 + "," + s2) //Exception in thread "main" java.lang.IllegalStateException: Duplicate key 3 (attempted merging values App and map)
                );
        System.out.println(map);
        //{3=App,map, 4=ball, 5=apple, 7=android}

        TreeMap<Integer, String> sortedMap = Stream.of("App", "map", "apple", "android", "ball").
                collect(Collectors.toMap(s -> s.length(), s -> s, (s1, s2) -> s1 + "," + s2,
                        TreeMap::new) //converts exisitng map to Treemap and sorts it
                );

        System.out.println(sortedMap);

        //{3=App,map, 4=ball, 5=apple, 7=android}
    }
}
