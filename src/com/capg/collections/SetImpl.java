package com.capg.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetImpl {

    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();

        hashSet.add("c");
        hashSet.add("Z");
        hashSet.add("a");
        hashSet.add("A");
        hashSet.add("d");
        hashSet.add("z");
        hashSet.add(null);
        hashSet.add(null);
        // hashSet.stream().sorted();
        System.out.println(hashSet); //[null, a, A, c, d, Z, z]


        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("A");
        linkedHashSet.add("Z");
        linkedHashSet.add("a");
        linkedHashSet.add("z");
        linkedHashSet.add("c");
        System.out.println(linkedHashSet); //[A, Z, a, z, c]

        Set<String> treeSetNull = new TreeSet<>();
        try {
            treeSetNull.add(null); //NPE
        } catch (NullPointerException npe) {
            System.out.println("NPE occurred");
        }

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Z");
        treeSet.add("a");
        treeSet.add("A");
        treeSet.add("z");
        // treeSet.add(null);
        System.out.println(treeSet); //[A, Z, a, z]
        //treeSet.
    }
}
