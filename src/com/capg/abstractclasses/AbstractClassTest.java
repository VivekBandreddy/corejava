package com.capg.abstractclasses;

public abstract class AbstractClassTest {
    private int i;
    protected int y;
    final int z = 10;
    static int w = 20;

    public AbstractClassTest(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }


    public int doubleValue() {
        return i * i;
    }

}
