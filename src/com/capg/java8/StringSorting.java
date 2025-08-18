package com.capg.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StringSorting {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList(
                "Groceries",
                "Sports",
                "Education",
                "Entertainment",
                "Food ",
                "Gifts & donations",
                "Household",
                "Personalcare",
                "Shopping",
                "Transport & Travel",
                "Upi",
                "Bills & Recharges",
                "Fuel ",
                "Others",
                "Pooja items",
                "Medicine & Hospital");
        stringList.sort(Comparator.naturalOrder());
        System.out.println(stringList);

    }
}
