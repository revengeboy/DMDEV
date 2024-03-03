package com.ekdev.homeworks.sixthHomework.functionalProgramming;

import com.ekdev.homeworks.sixthHomework.functionalProgramming.student.Student;
import com.ekdev.homeworks.sixthHomework.functionalProgramming.studentsAndAverage.StudentsAndAverageObject;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Util {

    public static double getAverageAssessment(List<Student> allStudents, int course, int assessmentsCount) {
        List<Student> students = Student.getStudentListByCourse(allStudents, course);
        return students.stream()
                .map(Student::getAssessmentsList)
                .filter(assessmentsList -> assessmentsList.size() > assessmentsCount)
                .mapToDouble(Student::getAverageGrade)
                .average()
                .orElse(0.0);
    }

    public static List<Student> sortStudentsByLastAndFirstName(List<Student> allStudents, int course) {
        List<Student> students = Student.getStudentListByCourse(allStudents, course);
        return students.stream()
                .sorted(Comparator.comparing(Student::getLastName).thenComparing(Student::getFirstName))
                .map(student -> new Student(student.getFirstName(), student.getLastName()))
                .collect(Collectors.toList());
    }

    public static StudentsAndAverageObject createStudentsAndAverageObject(List<Student> allStudents, int course,
                                                                          int assessmentsCount) {
        double average = getAverageAssessment(allStudents, course, assessmentsCount);
        return new StudentsAndAverageObject(allStudents, average);
    }
}
