package com.capg.exam.practice;

public class SumOfNumbers {
    public static int sumOfNumbersInString(String str) {
        int sum = 0;

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c))
                sum += Character.getNumericValue(c);
        }
        System.out.println(sum);

        int s1 = str.chars().mapToObj(c -> (char) c).filter(Character::isDigit).map(Character::getNumericValue).reduce(0, Integer::sum);
        System.out.println(s1);

        return 0;
    }

    public static void main(String[] args) {
        SumOfNumbers.sumOfNumbersInString("abc123def456");
        SumOfNumbers sumOfNumbers = new SumOfNumbers();
        System.out.println(sumOfNumbers.getClass());
        System.out.println(sumOfNumbers.hashCode());
        System.out.println(sumOfNumbers.toString());
    }
}
