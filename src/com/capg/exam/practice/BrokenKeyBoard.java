package com.capg.exam.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BrokenKeyBoard {

    public static void main(String[] args) {

        String sentence = "Hello world";
        String workingKey = "helowrd";
        sentence = sentence.replaceAll(" ", "");

        List<Character> workingKeyChars = workingKey.chars().mapToObj(c -> (char) Character.toUpperCase(c)).collect(Collectors.toList());
        System.out.println(workingKeyChars);


        String response1 =

                sentence.chars().allMatch(c -> workingKeyChars.contains((char) Character.toUpperCase(c))
                ) ? "Can Type" : "Cannot Type";

        System.out.println(response1);
    }


}
