package com.capg.multithreading;

public class WaitAndNotifyExample {

    public synchronized void produce() {
        System.out.println("produce execution begins...");
        try {
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("produce execution ends...");
    }

    public synchronized void consume() {
        System.out.println("Consuming...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        notify(); // Notify one waiting thread

    }

    public static void main(String[] args) {
        WaitAndNotifyExample waitAndNotifyExample = new WaitAndNotifyExample();
        new Thread(waitAndNotifyExample::produce).start();
        new Thread(waitAndNotifyExample::consume).start();

    }
}
