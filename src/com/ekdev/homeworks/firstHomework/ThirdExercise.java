package com.ekdev.homeworks.firstHomework;

public class ThirdExercise {

    public static void main(String[] args) {
        compareAreasOfRightTriangles(getAreaOfRightTriangle(5, 5), getAreaOfRightTriangle(5, 5));
        compareAreasOfRightTriangles(getAreaOfRightTriangle(3, 3), getAreaOfRightTriangle(6, 6));
        compareAreasOfRightTriangles(getAreaOfRightTriangle(8, 8), getAreaOfRightTriangle(4, 4));
    }

    public static double getAreaOfRightTriangle(int a, int b) {
        return 0.5 * (a * b);
    }

    public static void compareAreasOfRightTriangles(double firstArea, double secondArea) {
        if (firstArea > secondArea) {
            System.out.println("Area of the first triangle is greater");
        } else if (secondArea > firstArea) {
            System.out.println("Area of the second triangle is greater");
        } else {
            System.out.println("Areas of triangles are the same");
        }
    }
}
