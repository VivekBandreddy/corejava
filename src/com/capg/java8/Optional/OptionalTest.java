package com.capg.java8.Optional;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable(null);
        System.out.println(optional); //Optional.empty
        System.out.println(Optional.empty());//Optional.empty
        System.out.println(Optional.of("s")); //Optional[s]
        System.out.println("Optional.of(null) " + Optional.of(null));

        System.out.println("ti".hashCode());
        System.out.println("it".hashCode());
    }
}
