package com.capg.collections.list;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        System.out.println(linkedList.add(0)); //true
        System.out.println(linkedList.offer(1)); //true
        System.out.println(linkedList); //[0, 1]
        System.out.println(linkedList.remove()); //0
        System.out.println(linkedList.poll()); //1
        System.out.println(linkedList); //[]
        //System.out.println(linkedList.remove());
        System.out.println(linkedList.poll()); //null
        System.out.println(linkedList.peek());//null
        System.out.println(linkedList.element()); //exception bcoz of empty list
    }
}
