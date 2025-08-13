package com.capg.exam.practice;

public class DisariumNumber {

    public static void main(String[] args) {
        int no = 135;
        String s = String.valueOf(no);
        double count = 0;
        double index = 1;
        for (char c : s.toCharArray()) {
            Integer num = Character.getNumericValue(c);
            double result = Math.pow(num, index);
            count +=result;
            index++;
        }
        System.out.println(count);

    }
}
