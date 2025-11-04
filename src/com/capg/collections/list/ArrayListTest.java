package com.capg.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(15);
        for (int i = 0; i < 10; i++)
            integerList.addFirst(i);

        System.out.println(integerList); //[9, 8, 7, 6, 5, 4, 3, 2, 1, 0]

        System.out.println(integerList.get(9)); //0
        integerList.add(0, 10);
        System.out.println(integerList.get(10)); //0
        System.out.println(integerList.remove(10)); //0
        System.out.println(integerList.add(20)); //true
        System.out.println(integerList); //[10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 20]
        System.out.println(integerList.remove(Integer.valueOf(20))); //true
        System.out.println(integerList); //[10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
        System.out.println(integerList.contains(5)); //true
        System.out.println(integerList.indexOf(50)); //-1
        System.out.println(integerList.set(5, 21)); //5 returns old value

        //from 21 version
        System.out.println("JDK 21 Changes");
        System.out.println(integerList); //[10, 9, 8, 7, 6, 21, 4, 3, 2, 1]
        integerList.addFirst(20);
        integerList.addLast(25);
        System.out.println(integerList); //[20, 10, 9, 8, 7, 6, 21, 4, 3, 2, 1, 25]
        System.out.println(integerList.getLast()); //25
        System.out.println(integerList.getFirst());//20
        System.out.println(integerList.removeFirst()); //20
        System.out.println(integerList.removeLast());//25
        //21 changes end

        System.out.println(integerList); //[10, 9, 8, 7, 6, 21, 4, 3, 2, 1]
        integerList.sort(null); //sorts in Ascending order
        System.out.println("After sortinng " + integerList);//[1, 2, 3, 4, 6, 7, 8, 9, 10, 21]
        System.out.println(integerList.reversed()); //[21, 10, 9, 8, 7, 6, 4, 3, 2, 1] returns the list in reversed order doesn't modify the existing list
        System.out.println(integerList);//[1, 2, 3, 4, 6, 7, 8, 9, 10, 21]
        Collections.sort(integerList, Collections.reverseOrder()); //sorts in Descending order
        System.out.println(integerList);//[21, 10, 9, 8, 7, 6, 4, 3, 2, 1]

        integerList.removeIf(i -> i % 2 == 0);
        System.out.println(integerList);//[21, 9, 7, 3, 1]
    }
}
