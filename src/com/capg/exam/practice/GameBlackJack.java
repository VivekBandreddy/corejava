package com.capg.exam.practice;

public class GameBlackJack {
    public static void main(String[] args) {
        int[] player1 = {10, 9};

        int[] player2 = {8, 7};

        int p1Sum = 0, p2Sum = 0;

        for (int i : player1) {
            p1Sum += i;
        }

        for (int i : player2) {
            p2Sum += i;
        }

        if (p1Sum == p2Sum) {
            System.out.println("Draw");
        }

        if (p1Sum > p2Sum && p1Sum <= 21)
            System.out.println("Player 1 wins");

        System.out.println("Player 2 wins");
    }
}
