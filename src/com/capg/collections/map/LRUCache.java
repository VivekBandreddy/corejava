package com.capg.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private final int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.75f, true); // true for access-order
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {
        LRUCache<String, Integer> cache = new LRUCache<>(3);
        cache.put("A", 1);
        cache.put("B", 2);
        cache.put("C", 3);
        System.out.println("Initial cache: " + cache); // {A=1, B=2, C=3}

        cache.get("A"); // Access A, making it most recently used
        System.out.println("After accessing A: " + cache); // {B=2, C=3, A=1}

        cache.put("D", 4); // Adding D, B (eldest) is removed
        System.out.println("After adding D: " + cache); // {C=3, A=1, D=4}
    }
}