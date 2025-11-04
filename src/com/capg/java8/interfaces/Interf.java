package com.capg.java8.interfaces;

public interface Interf {
    private void show() {
        System.out.println("Inside show");
    }

    default void show(int i) {
        System.out.println("default show " + i);
    }
}
