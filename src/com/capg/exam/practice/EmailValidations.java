package com.capg.exam.practice;

import java.util.Arrays;
import java.util.stream.Collectors;

public class EmailValidations {
    public static void main(String[] args) {
        String[] emails ={"test.email+alex@leetcode.com","test.email.leet+alex@code.com"};
                //{"test.emailalex@leetcode.com","test.e.mailbob.cathy@leetcode.com","testemail+david@lee.tcode.com"};

        int count = (int) Arrays.asList(emails).stream().map(EmailValidations::ValidateEmail).collect(Collectors.toSet()).size();
        System.out.println(count);
    }

    private static String ValidateEmail(String email) {

        String name = email.split("@")[0];
        String domain = email.split("@")[1];
        if (name.contains("+")) {
            name = name.split("\\+")[0];
        }
        if (name.contains("."))
            name = name.replace(".", "");
        System.out.println(name+domain);
        return name +"@"+ domain;
    }
}
