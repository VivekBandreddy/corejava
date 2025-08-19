package com.capg.abstractclasses;

abstract class Animal {
    public abstract void bark();
}

class Dog extends Animal {

    @Override
    public void bark() {
        System.out.println("Dog is barking");
    }
}

public class GoldenRetriver extends Dog {
    @Override
    public void bark() {
        super.bark();
        System.out.println("GoldenRetriever is barking");
    }

    public static void main(String[] args) {
        Animal animal = new GoldenRetriver();
        animal.bark();
    }
}
