package com.capg.java8.interfaces;

@FunctionalInterface
public interface TestFI {

    int add(int i, int j);

    default void show(){
        System.out.println("inside default method");
    }
}
