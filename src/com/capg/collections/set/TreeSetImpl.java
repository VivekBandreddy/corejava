package com.capg.collections.set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetImpl {
    public static void main(String[] args) {
        NavigableSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < 10; i++)
            treeSet.add(i);

        System.out.println(treeSet); //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        System.out.println(treeSet.first()); //0
        System.out.println(treeSet.last());//9
        System.out.println(treeSet.floor(10)); //9 returns nearest greater value to the input
        System.out.println(treeSet.ceiling(-100));//0 returns nearest lower value to the input
        System.out.println(treeSet.lower(7));//6
        System.out.println(treeSet.higher(7));//8
        System.out.println("======" + treeSet);
        System.out.println(treeSet.pollFirst());//0 retrieves and removes first element
        System.out.println(treeSet.pollLast());//9 retrieves and removes last element
        System.out.println("======" + treeSet);
        System.out.println(treeSet.subSet(2, 7)); //[2, 3, 4, 5, 6]
        System.out.println(treeSet.headSet(5)); //[1, 2, 3, 4]
        System.out.println(treeSet.tailSet(5)); //[5, 6, 7, 8]
    }
}
