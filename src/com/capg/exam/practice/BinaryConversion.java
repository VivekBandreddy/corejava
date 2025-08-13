package com.capg.exam.practice;

public class BinaryConversion {
    public static void main(String[] args) {
        int n = 5;
        String s = new StringBuilder(Integer.toBinaryString(n)).reverse().toString();
        System.out.println(s);
        //int partitions = s.length()>=5 ? (int) Math.ceil(s.length()/8) : 2;
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i< s.length() ;i++){
            if(s.charAt(i) == '0'){
                sb.append('1');
                break;
            } else {
                sb.append(s.charAt(i));
            }
        }

        System.out.println(sb.toString());

        int num = Integer.parseInt(sb.toString() ,2);
        System.out.println(num);

    }
}
