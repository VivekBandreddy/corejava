package com.capg.Strings;

public class SCPTest {

    public static void main(String[] args) {
        String str = "1234 56!";
        String mtr = "1234" + " " + "56" + "!";
        String dtr = "1234 " + "56" + "!";
        String gtr = "1234 56" + "!";

        System.out.println((str == mtr) == (dtr == gtr));
    }
}
