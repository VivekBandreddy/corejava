package com.capg.collections.map;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) throws InterruptedException {
        Map<String, String> weakHashMap = new WeakHashMap<>();
        //Map<String, String> weakHashMap = new HashMap<>();

        String s = new String("Tom");
        String s1 = new String("Jerry");

        weakHashMap.put(s, "cat");
        weakHashMap.put(s1, "Mouse");
        System.out.println(weakHashMap); //{Tom=cat, Jerry=Mouse}

        s = null;
        System.gc();

        Thread.sleep(1000);
        System.out.println(weakHashMap); //{Jerry=Mouse}

    }
}
