package com.capg.exam.practice;

public class StringGoal {
    public static void main(String[] args) {
        StringGoal stringGoal = new StringGoal();
        //System.out.println(stringGoal.buddyStrings("aaaaaaabc", "aaaaaaacb"));
        System.out.println(stringGoal.buddyStrings("abc", "cab"));
    }

    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length())
            return false;

        if (s.equals(goal))
            return true;

        for (int i = 0; i < s.length(); i++) {
            //String newString = s.substring(i, i) +s.substring(0,j-1) +s.substring(j, s.length());
            /*for (int j = i+1; j < s.length(); j++) {

                System.out.println(newString);
                if (newString.equals(goal))
                    return true;
            }*/

        }

        return false;

    }
}
