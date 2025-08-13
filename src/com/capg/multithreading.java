package com.capg;

public class multithreading implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 26; i++) {
            // System.out.print(Thread.currentThread().getName());
            if ("alphabets".equalsIgnoreCase(Thread.currentThread().getName()))
                System.out.print((char) ('A' + i));
            else
                System.out.print(i + 1);
            System.out.print(" ");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        multithreading multithreading = new multithreading();
        Thread thread = new Thread(multithreading, "alphabets");
        thread.start();
        Thread thread2 = new Thread(new multithreading());
        thread2.start();
    }
}
