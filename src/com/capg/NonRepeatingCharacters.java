package com.capg;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class NonRepeatingCharacters {

    public static void main(String[] args) {
        String input = "vivek";

        char[] ch = input.toCharArray();
        Set<Character> characterSet = new HashSet<>();
        for (char c : ch) {
            if (characterSet.add(c))
                System.out.print(" " + c);
        }

        Set<Character> charSet = input.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
        System.out.println(charSet);

    }
}
