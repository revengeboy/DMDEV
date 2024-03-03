package com.ekdev.homeworks.sixthHomework.functionalProgramming;

import com.ekdev.homeworks.sixthHomework.functionalProgramming.student.Student;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Util {

    public static double getAverageAssessment(List<Student> studentsList) {
        return studentsList.stream()
                .map(Student::getAssessmentsList)
                .filter(assessmentsList -> assessmentsList.size() > 3)
                .mapToDouble(Student::getAverageGrade)
                .average()
                .orElse(0.0);
    }

    public static List<Student> sortStudentsByNameAndSurname(List<Student> studentsList) {
        return studentsList.stream()
                .sorted(Comparator.comparing(Student::getSurname).thenComparing(Student::getName))
                .map(student -> new Student(student.getName(), student.getSurname(), null, null))
                .collect(Collectors.toList());
    }
}
