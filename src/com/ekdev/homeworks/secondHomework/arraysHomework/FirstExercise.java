package com.ekdev.homeworks.secondHomework.arraysHomework;

import java.util.Arrays;

public class FirstExercise {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(multiplyElementsInArray(deleteNegativeNumbers(new int[]{1, 2, 3, - 3, - 4,
                5}))));
        System.out.println(Arrays.toString(multiplyElementsInArray(deleteNegativeNumbers(new int[]{- 1, 7, 5, - 3, - 4}))));
    }

    private static int[] multiplyElementsInArray(int[] initialArray) {
        int index = 0;
        int arrayLength = initialArray.length;
        for (int element : initialArray) {
            initialArray[index] = element * arrayLength;
            index++;
        }
        return initialArray;
    }

    // знаю что нельзя пока так, но других идей нет :(
    private static int[] deleteNegativeNumbers(int[] initialArray) {
        return Arrays.stream(initialArray).filter(number -> number >= 0).toArray();
    }
}
