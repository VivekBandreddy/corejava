package com.capg.multithreading;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
    public static void main(String[] args) throws InterruptedException {
        int numberOfTasks = 3;
        CountDownLatch latch = new CountDownLatch(3);

        for (int i = 1; i <= numberOfTasks; i++) {
            Thread worker = new Thread(new Worker(latch, i));
            worker.start();
        }

        System.out.println("Main thread waiting for workers to finish...");
        latch.await(); // Wait until count reaches zero
        System.out.println("All workers finished. Main thread proceeding.");
    }
}

class Worker implements Runnable {
    private final CountDownLatch latch;
    private final int workerId;

    public Worker(CountDownLatch latch, int workerId) {
        this.latch = latch;
        this.workerId = workerId;
    }

    @Override
    public void run() {
        try {
            System.out.println("Worker " + workerId + " is working...");
            Thread.sleep(1000 * workerId); // Simulate work
            System.out.println("Worker " + workerId + " finished.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            latch.countDown(); // Decrement the count
        }
    }
}