package com.ekdev.homeworks.firstHomework;

public class FirstExercise {

    public static void main(String[] args) {
        printQuarterOfHour(0);
        printQuarterOfHour(10);
        printQuarterOfHour(16);
        printQuarterOfHour(45);
        printQuarterOfHour(57);
        printQuarterOfHour(999);
    }

    public static void printQuarterOfHour(int minutes) {
        if (minutes >= 0 && minutes <= 15) {
            System.out.println("First Quarter");
        } else if (minutes > 15 && minutes <= 30) {
            System.out.println("Second Quarter");
        } else if (minutes > 30 && minutes <= 45) {
            System.out.println("Third Quarter");
        } else if (minutes > 45 && minutes <= 59) {
            System.out.println("Fourth Quarter");
        } else {
            System.err.println("Invalid minutes value");
        }
    }
}
