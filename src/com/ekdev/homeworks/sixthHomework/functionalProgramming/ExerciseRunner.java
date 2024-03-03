package com.ekdev.homeworks.sixthHomework.functionalProgramming;

import com.ekdev.homeworks.sixthHomework.functionalProgramming.student.Student;
import com.ekdev.homeworks.sixthHomework.functionalProgramming.studentsAndAverage.StudentsAndAverageObject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExerciseRunner {

    public static void main(String[] args) {
        List<Student> studentsList = TestData.getStudentsList();

        Map<Integer, Double> mapWithAverageAssessment = new HashMap<>();
        int firstCourse = 1;
        mapWithAverageAssessment.put(firstCourse, Util.getAverageAssessment(studentsList, firstCourse, 3));
        System.out.println(mapWithAverageAssessment);

        Map<Integer, List<Student>> mapWithStudentsSorted = new HashMap<>();
        int secondCourse = 2;
        mapWithStudentsSorted.put(secondCourse, Util.sortStudentsByLastAndFirstName(studentsList, secondCourse));
        System.out.println(mapWithStudentsSorted);

        Map<Integer, StudentsAndAverageObject> mapWithStudentsSortedAndAverage = new HashMap<>();
        int thirdCourse = 3;
        mapWithStudentsSortedAndAverage.put(thirdCourse, Util.createStudentsAndAverageObject(studentsList,
                thirdCourse, 3));
        System.out.println(mapWithStudentsSortedAndAverage);
    }
}
