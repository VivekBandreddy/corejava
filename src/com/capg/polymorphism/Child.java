package com.capg.polymorphism;

public class Child extends Parent {

    //@Override
    public void override() {
        super.override();
        System.out.println("Inside Child class");
        //Inside Parent class
        //Inside Child class
    }

    public int dummy(){
        return 10;
    }

    public static void main(String[] args) {
        Parent parent = new Child();
        parent.override();
        //parent.
    }
}
