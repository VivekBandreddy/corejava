package com.capg.collections;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetImpl {

    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Z");
        hashSet.add("a");
        hashSet.add("A");
        hashSet.add("z");
        System.out.println(hashSet);


        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("A");
        linkedHashSet.add("Z");
        linkedHashSet.add("a");
        linkedHashSet.add("z");
        System.out.println(linkedHashSet);


        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Z");
        treeSet.add("a");
        treeSet.add("A");
        treeSet.add("z");
        System.out.println(treeSet);
    }
}
