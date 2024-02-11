package com.ekdev.homeworks.thirdHomework.stringsHomework;

import java.util.Arrays;

public class SecondExercise {

    /*
    Дана строка с текстом, в котором есть цифры от 0 до 9.

Написать 2 метода:

- возвращающий массив цифр из переданной строки
- возвращающий сумму цифр из переданного целочисленного массива

Посчитать сумму всех чисел из строки

Например: “Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?” -> 18 (8+1+2+4+3)
     */

    public static void main(String[] args) {
        int[] allIntegers = getNumbersArrayFromString("Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?");
        System.out.println(getSumOfAllIntsArray(allIntegers));
    }

    private static int[] getNumbersArrayFromString(String initialString) {
        String onlyNumbersString = initialString.replaceAll("[^0-9]", "");
        char[] charArray = onlyNumbersString.toCharArray();
        int[] num = new int[onlyNumbersString.length()];
        for (int i = 0; i < onlyNumbersString.length(); i++) {
            num[i] = Character.getNumericValue(charArray[i]);
        }
        return num;
    }

    private static int getSumOfAllIntsArray(int[] initialArray) {
        int sum = 0;
        for (int i : initialArray) {
            sum += i;
        }
        return sum;
    }
}
