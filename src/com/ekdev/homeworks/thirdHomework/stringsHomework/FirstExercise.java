package com.ekdev.homeworks.thirdHomework.stringsHomework;

import java.util.Locale;

public class FirstExercise {

    /*
    Дана строка.
Удалить из нее все повторяющиеся символы без учета регистра, если они идут друг за другом. Также удалить пробелы.
Результат привести к верхнему регистру.

Например: "abc Cpddd Dio OsfWw" -> "ABCPDIOSFW"
     */

    public static void main(String[] args) {
        String initialString = "abc Cpddd Dio OsfWw";
        String loweredSting = initialString.toLowerCase(Locale.ROOT);
        String stringWithoutSpaces = removeSpaces(loweredSting);
        String stringWithoutDuplicates = removeConsDuplicateFromString(stringWithoutSpaces);
        System.out.println(stringWithoutDuplicates.toUpperCase(Locale.ROOT));
    }

    private static String removeSpaces(String initialString) {
        return initialString.replace(" ", "");
    }

    private static String removeConsDuplicateFromString(String initialString) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < initialString.length(); i++) {
            String charString = String.valueOf(initialString.charAt(i));
            if (! result.toString().contains(charString)) {
                result.append(initialString.charAt(i));
            }
        }
        return result.toString();
    }
}
