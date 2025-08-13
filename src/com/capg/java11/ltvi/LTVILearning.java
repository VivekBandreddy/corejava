package com.capg.java11.ltvi;

public class LTVILearning {

    public static void main(String[] args) {
        var x = "abd";
        System.out.println(x + " instanceof String :  " + (x instanceof String));
        //abd instanceof String :  true

        var y = 123;
        System.out.println(y);
        //123

        y = 234; //value can change
        System.out.println(y);
        //234

        //y = "abcd"; CE cannot modify it type

        //var z = null; CE
        var z = (String) null;

       /* var a; //CE initilization and declaration should be at same line
        a = 5;
       */
    }
}
