package com.ekdev.homeworks.sixthHomework.functionalProgramming.student;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Student {

    private String firstName;
    private String lastName;
    private Integer course;
    private List<Double> assessmentsList;

    public Student(String firstName, String lastName, Integer course, List<Double> assessmentsList) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.assessmentsList = assessmentsList;
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static double getAverageGrade(List<Double> grades) {
        return grades.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
    }

    public static List<Student> getStudentListByCourse(List<Student> studentList, int course) {
        return studentList.stream()
                .filter(student -> student.getCourse() == course)
                .collect(Collectors.toList());
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public List<Double> getAssessmentsList() {
        return assessmentsList;
    }

    public void setAssessmentsList(List<Double> assessmentsList) {
        this.assessmentsList = assessmentsList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && Objects.equals(course, student.course) && Objects.equals(assessmentsList, student.assessmentsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, course, assessmentsList);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", course=" + course +
                ", assessmentsList=" + assessmentsList +
                '}';
    }
}
