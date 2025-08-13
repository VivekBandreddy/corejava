package com.capg.java8.localization;

import java.text.NumberFormat;
import java.util.Locale;

public class Localization {

    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println(locale);
        //en_IN

        int i = 10000;

        System.out.println(NumberFormat.getNumberInstance().format(i));
        //10,000
        System.out.println(NumberFormat.getNumberInstance(Locale.ITALY).format(i));
        //10.000
        System.out.println(NumberFormat.getNumberInstance(Locale.US).format(i));
        //10,000

        System.out.println(NumberFormat.getCurrencyInstance().format(i));
        //₹10,000.00
        System.out.println(NumberFormat.getCurrencyInstance(Locale.ITALY).format(i));
        //10.000,00 €
        System.out.println(NumberFormat.getCurrencyInstance(Locale.US).format(i));
        //$10,000.00
    }
}
