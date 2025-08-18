package com.capg.exam.practice;

public class CreditCardMasking {
    public static void main(String[] args) {
        String creditCardNumber = "1234567890123456";

        if (creditCardNumber.length() < 16) {
            //return "Invalid credit card number. It must be 16 digits long.";
        }

        int counter = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < creditCardNumber.length() - 4; i++) {
            sb.append("X");
            counter++;
            if (counter == 4) {
                counter = 0;
                sb.append("-");
            }

        }

        sb.append(creditCardNumber.substring(creditCardNumber.length() - 4, creditCardNumber.length()));
        System.out.println(sb.toString());
    }
}
