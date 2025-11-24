package com.capg.multithreading;

import java.util.Scanner;

public class VolatileExample extends Thread {

    volatile boolean flag = true;

    public void run() {
        int i = 0;
        while (flag) {
            System.out.println("Hello " + i);
            i++;
        }
    }

    public void updateFlag() {
        flag = false;
    }

    public static void main(String[] args) {
        VolatileExample volatileExample = new VolatileExample();
        Thread t = new Thread(volatileExample);
        Thread t1 = new Thread(volatileExample);
        Thread t2 = new Thread(volatileExample);

        t.start();
        t1.start();
        t2.start();

        new Scanner(System.in).nextLine();
        System.out.println("Hit Enter to stop");
        volatileExample.updateFlag();
        System.out.println("process terminated");
    }
}
