package com.capg.multithreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerExample {
    private BlockingQueue<Integer> queue;

    public void executeProducerConsumer() {
        queue = new ArrayBlockingQueue<>(10);
        Runnable producer = () -> {
            for (int i = 0; i < 25; i++) {
                try {
                    queue.put(i);
                    System.out.println("Produced: " + i);
                    System.out.println("Produced queue size : " + queue.size());
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Runnable consumer = () -> {
            try {
                for (int i = 0; i < 10; i++) {
                    int value = queue.take();
                    System.out.println("Consumed: " + value);
                    System.out.println("Consumed queue size : " + queue.size());
                    //Thread.sleep(20000);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();
    }

    public static void main(String[] args) {

        ProducerConsumerExample producerConsumerExample = new ProducerConsumerExample();
        producerConsumerExample.executeProducerConsumer();
    }
}
