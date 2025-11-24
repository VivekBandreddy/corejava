package com.capg.multithreading;

public class AlphaNumericExample {

    public void printAlphaNumerics() {

        Runnable numerics = () -> {
            for (int i = 1; i < 27; i++) {
                System.out.print(" " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Runnable alphabets = () -> {
            for (int i = 0; i < 26; i++) {
                System.out.print(" " + (char) ('A' + i));
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread n = new Thread(numerics);
        Thread a = new Thread(alphabets);

        a.run();
        n.run();
    }

    public static void main(String[] args) {
        new AlphaNumericExample().printAlphaNumerics();
    }
}
