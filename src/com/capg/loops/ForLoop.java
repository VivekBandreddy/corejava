package com.capg.loops;

import java.util.ArrayList;
import java.util.List;

public class ForLoop {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        for (int i = 10; i < 20; i++)
            integerList.add(i);

        System.out.println(integerList);

        for (int i = 8; i < integerList.size(); i++)
            System.out.println("inside normal for index " + i + " Value : " + integerList.get(i));

        for (int i : integerList)
            System.out.println("inside enhanced for loop : " + i);

        integerList.forEach(l -> System.out.println("lambda " + l));
        integerList.forEach(System.out::println);
    }
}
