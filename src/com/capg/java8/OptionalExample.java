package com.capg.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integerList.add(i);
        }

        Optional<Integer> s = integerList.stream().filter(i -> i / 21 == 0).findAny();

        if (s.isEmpty()) {
            System.out.println("Result is empty");
        }

        if (s.isPresent()) {
            System.out.println("value is : " + s.get());
        }

        String str = null;

        Optional<String> op = Optional.ofNullable(null);
        System.out.println(op);

        String a ="abc";
        Optional<String> opa = Optional.ofNullable(a);
        System.out.println(opa);
    }
}
