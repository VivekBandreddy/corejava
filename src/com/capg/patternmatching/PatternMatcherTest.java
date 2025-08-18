package com.capg.patternmatching;

import java.util.regex.Pattern;

public class PatternMatcherTest {
    public static void main(String[] args) {
        String value = "9A@._-";
        String regex = "^[\\w@.-]+$";
        //"\\w+";
        Pattern p = Pattern.compile(regex);
        System.out.println(p.matcher(value).matches());
    }
}
