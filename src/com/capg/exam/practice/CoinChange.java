package com.capg.exam.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoinChange {
    public static void main(String[] args) {
        List<Integer> coins = Arrays.asList(1, 2, 5);
        int total = 5;
        List<Integer> possibleList = new ArrayList<>();

        for (int i = 0; i < coins.size(); i++) {
            int sum = coins.get(i);

            if(sum == coins.get(i)){
                possibleList.add(1);
                break;
            }

            int square = coins.get(i) + coins.get(i);
            if (square == total) {
                possibleList.add(2);
            }

            for (int j = i + 1; j < coins.size(); j++) {
                sum += coins.get(j);
                System.out.println(sum);
                if (sum == total) {
                    possibleList.add(j);
                }
                if (square + coins.get(j) == total) {
                    possibleList.add(3);
                }
            }

        }

        System.out.println(possibleList);

        if (possibleList.isEmpty()) {
            for (int i = coins.size() - 1, j = 0; i >= 0; i--, j++) {
                int square = coins.get(i) + coins.get(i);
                int sum = square + coins.get(j);
                if (total == sum) {
                    possibleList.add(3);
                }
            }
        }

        System.out.println(possibleList);

       if(possibleList.isEmpty()){
           System.out.println("empty");
       }

       possibleList.sort(null);
       System.out.println(possibleList.get(0));

    }

}
