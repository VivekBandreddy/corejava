package com.capg.multithreading;

public class SynchronizedExample {
    private int count;
    private int synchronizedCount;

    public synchronized void updateCount() {
        synchronizedCount++;
    }

    public void overRideRun() throws InterruptedException {

        Runnable r = () -> {
            for (int i = 0; i < 10000; i++)
                count++;
        };

        Runnable r1 = () -> {
            for (int i = 0; i < 10000; i++)
                updateCount();
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("without synchronized " + count);
        Thread t3 = new Thread(r1);
        Thread t4 = new Thread(r1);
        t3.start();
        t4.start();
        t3.join();
        t4.join();
        System.out.println("with synchronized " + synchronizedCount);

    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizedExample synchronizedExample = new SynchronizedExample();
        synchronizedExample.overRideRun();
    }
}
