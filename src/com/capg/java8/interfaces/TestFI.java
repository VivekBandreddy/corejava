package com.capg.java8.interfaces;

@FunctionalInterface
public interface TestFI {

    int add(int i, int j);

    boolean equals(Object var1);

    default void show(){
        System.out.println("inside default method");
    }
}
