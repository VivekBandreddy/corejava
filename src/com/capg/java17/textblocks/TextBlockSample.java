package com.capg.java17.textblocks;

public class TextBlockSample {

    public static void main(String[] args) {
        String str = "Tom & Jerry";
        String tbStr = """
                Tom & Jerry""";

       /* """abchdb"""; //CE
        """bsahbb
                """ //CE
        """
                """ //No CE*/

        System.out.println(str == tbStr);
        System.out.println(str.equals(tbStr));
        System.out.println(tbStr.toUpperCase());
        System.out.println(tbStr.substring(0, 3));

        str = "Hamlet: \"There is nothing good or bad, but thinking makes it so\"......... , " +
                "Hamlet: \"There is nothing good or bad, but thinking makes it so\"......... ";

        tbStr = """
                Hamlet: "There is nothing good or bad, but thinking makes it so"......... , Hamlet: "There is nothing good or bad, but thinking makes it so".........
                """;

        System.out.println(str);
        System.out.println(tbStr);


        String name  = """
               My name is :  """ + str;

        System.out.println(name);

    }
}
