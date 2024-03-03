package com.ekdev.homeworks.sixthHomework.functionalProgramming.student;

import java.util.List;
import java.util.Objects;

public class Student {

    private String name;
    private String surname;
    private Integer course;
    private List<Double> assessmentsList;

    public Student(String name, String surname, Integer course, List<Double> assessmentsList) {
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.assessmentsList = assessmentsList;
    }

    public static double getAverageGrade(List<Double> grades) {
        return grades.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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
        return Objects.equals(name, student.name) && Objects.equals(surname, student.surname) && Objects.equals(course, student.course) && Objects.equals(assessmentsList, student.assessmentsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course, assessmentsList);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                ", assessmentsList=" + assessmentsList +
                '}';
    }
}
