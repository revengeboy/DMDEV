package com.ekdev.homeworks.sixthHomework.functionalProgramming;

import com.ekdev.homeworks.sixthHomework.functionalProgramming.student.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class ExerciseRunner {

    public static void main(String[] args) {
        Student ivan = new Student("Ivan", "Ivanov", 1, List.of(4.0, 4.0, 5.0, 8.0, 8.0, 9.0));
        Student petr = new Student("Petr", "Petrov", 5, List.of(5.0, 5.0, 9.0, 8.0, 4.0));
        Student sveta = new Student("Sveta", "Svetova", 4, List.of(4.0, 5.0, 2.0, 8.0, 6.0));
        Student lena = new Student("Lena", "Lenochkina", 3, List.of(4.0, 4.0, 4.0, 4.0, 4.0));
        List<Student> students = new ArrayList<>();
        students.add(ivan);
        students.add(petr);
        students.add(sveta);
        students.add(lena);
        System.out.println(Util.getAverageAssessment(students));
        System.out.println(Util.sortStudentsByNameAndSurname(students));
    }


}
