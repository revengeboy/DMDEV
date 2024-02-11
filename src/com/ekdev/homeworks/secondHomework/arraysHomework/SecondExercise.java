package com.ekdev.homeworks.secondHomework.arraysHomework;

import java.util.Arrays;

public class SecondExercise {

    public static void main(String[] args) {
        char[] initialCharArray = new char[]{'a', 'b', 'c', 'd', 'e'};
        System.out.println();
        int[] intArray = charArrayToInt(initialCharArray);
        System.out.println(Arrays.toString(intArray));
        System.out.println();
        int average = getAverageOfArray(intArray);
        System.out.println(average);
        System.out.println();
        printElementsOfArrayGreaterThanInt(intArray, average);
    }

    private static int[] charArrayToInt(char[] initialArray) {
        int[] intArray = new int[initialArray.length];
        for (int i = 0; i < initialArray.length; i++) {
            intArray[i] = initialArray[i];
        }
        return intArray;
    }

    private static int getAverageOfArray(int[] initialArray) {
        int sumOfAllIntegers = 0;
        for (int i : initialArray) {
            sumOfAllIntegers += i;
        }
        return sumOfAllIntegers / initialArray.length;
    }

    private static void printElementsOfArrayGreaterThanInt(int[] initialArray, int intToCompare) {
        System.out.println("Последующие числа должны быть больше следующего числа - " + intToCompare);
        for (int integer : initialArray) {
            if (integer > intToCompare) {
                System.out.println(integer);
            }
        }
    }
}
