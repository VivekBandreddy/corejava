package com.capg.java11.privateinterfaces;

public interface TenninsInteface {

    private static void hit(String stroke) {
        System.out.println("Move into Position");
        System.out.println("hit a " + stroke);
        System.out.println("Move back into ready position");
    }

    static void forehand() {
        hit("forehand");
    }

    default void backhand() {
        hit("backhand");
    }

    private void smash() {
        hit("smash");
    }
}

