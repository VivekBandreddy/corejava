package com.capg.collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();

        System.out.println(map.put(1, 1)); //null
        System.out.println(map.put(1, 2));//1
        System.out.println(map.get(1));//2
        System.out.println(map.remove(1));//2
        System.out.println(map.remove(1));//null
        System.out.println(map.get(1)); //null

        for (int i = 0; i < 5; i++)
            map.put(i, i * i);

        map.forEach((k, v) -> System.out.println("key : " + k + ", Value : " + v));
    }
}
