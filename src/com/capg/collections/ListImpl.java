package com.capg.collections;

import java.util.Arrays;
import java.util.List;

public class ListImpl {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a","b","c");
        list.add("d");
        System.out.println(list);
    }
}
