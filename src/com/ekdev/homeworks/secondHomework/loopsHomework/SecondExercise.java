package com.ekdev.homeworks.secondHomework.loopsHomework;

public class SecondExercise {

    public static void main(String[] args) {
        System.out.println(reverseNumber(0));
        System.out.println(reverseNumber(123));
        System.out.println(reverseNumber(987));
    }

    private static int reverseNumber(int numberToReverse) {
        int reversedNumber = 0;
        if (numberToReverse == 0) {
            return numberToReverse;
        } else {
            for (; numberToReverse > 0; numberToReverse /= 10) {
                int mod = numberToReverse % 10;
                reversedNumber = reversedNumber * 10 + mod;
            }
        }
        return reversedNumber;
    }
}
