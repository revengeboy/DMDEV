package com.ekdev.homeworks.secondHomework.loopsHomework;

public class FirstExercise {

    public static void main(String[] args) {
        System.out.println(getAmountOfEvenNumbers(1234));
        System.out.println(getAmountOfOddNumbers(3789));
        System.out.println(getAmountOfEvenNumbers(- 1234));
        System.out.println(getAmountOfOddNumbers(- 334455));
    }

    private static int getAmountOfEvenNumbers(int numberToCheck) {
        int amount = 0;
        while (numberToCheck != 0) {
            int remainder = numberToCheck % 10;
            if (remainder % 2 == 0) {
                amount++;
            }
            numberToCheck /= 10;
        }
        return amount;
    }

    private static int getAmountOfOddNumbers(int numberToCheck) {
        int amount = 0;
        while (numberToCheck != 0) {
            int remainder = numberToCheck % 10;
            if (remainder % 2 != 0) {
                amount++;
            }
            numberToCheck /= 10;
        }
        return amount;
    }
}
