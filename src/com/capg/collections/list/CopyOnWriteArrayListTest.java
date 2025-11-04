package com.capg.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListTest {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        CopyOnWriteArrayList<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(i);
            if (i < 2)
                copyOnWriteArrayList.add(i);
        }

        System.out.println(list);//[0, 1, 2, 3, 4]
        System.out.println(copyOnWriteArrayList); //[0, 1]


        System.out.println(copyOnWriteArrayList.addAllAbsent(list)); //3
        System.out.println(copyOnWriteArrayList); //[0, 1, 2, 3, 4]
        System.out.println(copyOnWriteArrayList.addIfAbsent(0)); //false
        System.out.println(copyOnWriteArrayList.addIfAbsent(5)); //true
    }
}
