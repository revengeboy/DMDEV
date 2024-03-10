package com.ekdev.homeworks.sixthHomework.functionalProgramming;

import com.ekdev.homeworks.sixthHomework.functionalProgramming.student.Student;

import java.util.ArrayList;
import java.util.List;

public class TestData {

    public static List<Student> getStudentsList() {
        Student ivan = new Student("Ivan", "Ivanov", 1, List.of(4.0, 4.0, 5.0, 8.0, 8.0, 9.0));
        Student katya = new Student("Katya", "Katkova", 1, List.of(5.0, 5.0, 6.0, 7.0, 9.0, 9.0));
        Student petr = new Student("Petr", "Petrov", 2, List.of(5.0, 5.0, 9.0, 8.0, 4.0));
        Student sveta = new Student("Sveta", "Svetova", 2, List.of(4.0, 5.0, 2.0, 8.0, 6.0));
        Student lena = new Student("Lena", "Lenochkina", 3, List.of(4.0, 4.0, 4.0, 4.0, 4.0));
        Student tolya = new Student("Tolya", "Tolikov", 3, List.of(5.0, 2.0, 9.0, 9.0, 9.0));
        List<Student> students = new ArrayList<>();
        students.add(ivan);
        students.add(katya);
        students.add(petr);
        students.add(sveta);
        students.add(lena);
        students.add(tolya);
        return students;
    }
}
