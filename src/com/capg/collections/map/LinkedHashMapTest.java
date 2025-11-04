package com.capg.collections.map;

import java.util.LinkedHashMap;

public class LinkedHashMapTest {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>(3);

        for (int i = 0; i < 5; i++)
            linkedHashMap.put(i, i);

        System.out.println(linkedHashMap); //{0=0, 1=1, 2=2, 3=3, 4=4}

    }
}
