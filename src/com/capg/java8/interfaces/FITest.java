package com.capg.java8.interfaces;

public interface FITest extends TestFI {

    int x = 10;

    int sub(int i, int j);

    default void show() {
        System.out.println("inside default method");
    }
}
