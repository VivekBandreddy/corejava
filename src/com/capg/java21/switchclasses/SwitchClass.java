package com.capg.java21.switchclasses;

public class SwitchClass {

    public static String patternMatchingWithGaurd(Object obj) {
        return switch (obj) {
            case String s when s.length() > 5 -> "String with data > 5";
            case String s -> "String with data";
            case Integer i when i % 2 == 0 -> "even number";
            case Integer i when i % 2 != 0 -> "odd number";
            // case String s when s.length() > 5 -> "String with data > 5"; //CE
            default -> "genric type";
        };
    }

    public static String checkEvenOrOdd(Integer i) {
        return switch (i) {
            case Integer k when i % 2 == 0 -> "even";
            case Integer k when i % 2 != 0 -> "odd";
            default -> "no use";
        };
    }

    public static void main(String[] args) {
        System.out.println(SwitchClass.patternMatchingWithGaurd("bhfdab"));
        System.out.println(SwitchClass.patternMatchingWithGaurd("abcd"));
        System.out.println(SwitchClass.patternMatchingWithGaurd(10));
        System.out.println(SwitchClass.patternMatchingWithGaurd(11));
        System.out.println(SwitchClass.patternMatchingWithGaurd(10000.00));

        System.out.println(SwitchClass.checkEvenOrOdd(10));
        System.out.println(SwitchClass.checkEvenOrOdd(11));
    }
}
