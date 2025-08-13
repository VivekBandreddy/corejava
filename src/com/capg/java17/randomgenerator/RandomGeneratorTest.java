package com.capg.java17.randomgenerator;

import java.util.random.RandomGenerator;

public class RandomGeneratorTest {

    public static void main(String[] args) {
        RandomGenerator randomGenerator = RandomGenerator.getDefault();
        System.out.println(randomGenerator);
    }
}
