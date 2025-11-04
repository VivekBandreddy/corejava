package com.capg.collections.map;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapTest {
    public static void main(String[] args) {
        Map<String, String> identityHashMap = new IdentityHashMap<>();
        //HashMap<String, String> identityHashMap = new HashMap<>();

        String i = new String("10"); //100
        String i1 = new String("10"); //101

        identityHashMap.put(i, "ABC");
        identityHashMap.put(i1, "DEF");

        System.out.println(identityHashMap); //{10=ABC, 10=DEF}

        System.out.println(identityHashMap.get("10")); //null

        for (int k = 0; k < 35; k++) {
            String s = new String("" + k);
            identityHashMap.put(s, s);
        }

        System.out.println(identityHashMap.size()); //37
        System.out.println(identityHashMap); //{8=8, 10=10, 23=23, 32=32, 10=ABC, 9=9, 29=29, 31=31, 7=7, 2=2, 17=17, 20=20, 11=11, 25=25, 21=21, 3=3, 18=18, 4=4, 1=1, 5=5, 22=22, 26=26, 19=19, 33=33, 10=DEF, 12=12, 28=28, 24=24, 14=14, 30=30, 0=0, 13=13, 15=15, 16=16, 6=6, 34=34, 27=27}
        //{8=8, 10=10, 23=23, 32=32, 10=ABC, 9=9, 29=29, 31=31, 7=7, 2=2, 17=17, 20=20, 11=11, 25=25, 21=21, 3=3, 18=18, 4=4, 1=1, 5=5, 22=22, 26=26, 19=19, 33=33, 10=DEF, 12=12, 28=28, 24=24, 14=14, 30=30, 0=0, 13=13, 15=15, 16=16, 6=6, 34=34, 27=27}


    }
}
