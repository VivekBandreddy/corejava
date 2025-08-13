package com.capg;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class AverageCount {

    public static void main(String[] args) {

        List<List<Integer>> integerLists = new CopyOnWriteArrayList<>();

        List<Integer> integerList = new CopyOnWriteArrayList<>();
        List<Integer> integerList1 = new CopyOnWriteArrayList<>();
        List<Integer> integerList2 = new CopyOnWriteArrayList<>();
        List<Integer> integerList3 = new CopyOnWriteArrayList<>();

        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(5);

        integerList1.add(4);
        integerList1.add(2);
        integerList1.add(3);
        integerList1.add(1);

        integerList2.add(5);
        integerList2.add(4);
        integerList2.add(6);
        integerList2.add(1);

        integerList3.add(1);
        integerList3.add(4);

        integerLists.add(integerList);
        integerLists.add(integerList1);
        integerLists.add(integerList2);
        integerLists.add(integerList3);

        int averageCount = integerLists.stream().map(AverageCount::getSum).mapToInt(Integer::intValue).sum();

        System.out.println(averageCount);
    }

    private static int getSum(List<Integer> integerList) {
        integerList.sort(null);
        integerList.removeFirst();
        integerList.removeLast();
        // System.out.println(integerList.stream().reduce(0, Integer::sum));

        return integerList.stream().reduce(0, Integer::sum);
    }
}
