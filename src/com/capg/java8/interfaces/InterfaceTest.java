package com.capg.java8.interfaces;

interface A {
    default int add(int i, int j) {
        System.out.println("inisde interface A");
        return i + j;
    }
}

interface B {
    default int add(int x, int y) {
        System.out.println("inisde interface B");
        return x % y;
    }
}

public class InterfaceTest implements A, B {

    @Override
    public int add(int i, int j) {
        System.out.println("inside Class c");
        //return i * i + j;
        return B.super.add(i, j);
    }

    public static void main(String[] args) {
        InterfaceTest interfaceTest = new InterfaceTest();
        System.out.println(interfaceTest.add(25, 10));

        TestFI testFI = (i, j) -> i + j;

        System.out.println(testFI.add(10, 20));
    }
}
