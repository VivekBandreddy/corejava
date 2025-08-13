package com.capg.exam.practice;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingChar {


    public static void main(String[] args) {
        String str = "vivek";
        Set<Character> charset = new HashSet<>();
        for (char c : str.toCharArray()) {
            //System.out.println(c);
            if (!charset.add(c)) {
                System.out.println(c);
                break;
            }
        }
    }

}
