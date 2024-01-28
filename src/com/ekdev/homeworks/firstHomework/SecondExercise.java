package com.ekdev.homeworks.firstHomework;

public class SecondExercise {

    public static void main(String[] args) {
        System.out.println(mathFunctions(21.1, 13.5, '+'));
        System.out.println(mathFunctions(11.5, 5.5, '-'));
        System.out.println(mathFunctions(10, 5, '/'));
        System.out.println(mathFunctions(2, 3, '*'));
        System.out.println(mathFunctions(6, 4, '%'));
        System.out.println(mathFunctions(5, 5, '?'));
    }

    public static double mathFunctions(double operand1, double operand2, char operation) {
        if (operation == '+') {
            return operand1 + operand2;
        } else if (operation == '-') {
            return operand1 - operand2;
        } else if (operation == '*') {
            return operand1 * operand2;
        } else if (operation == '/') {
            return operand1 / operand2;
        } else if (operation == '%') {
            return operand1 % operand2;
        } else {
            throw new IllegalArgumentException("Unexpected operation");
        }
    }
}
