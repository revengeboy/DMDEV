package com.ekdev.homeworks.sixthHomework.functionalProgramming.studentsAndAverage;

import com.ekdev.homeworks.sixthHomework.functionalProgramming.student.Student;

import java.util.List;
import java.util.Objects;

public class Report {

    private List<Student> studentList;
    private Double average;

    public Report(List<Student> studentList, Double average) {
        this.studentList = studentList;
        this.average = average;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Report that = (Report) o;
        return Objects.equals(studentList, that.studentList) && Objects.equals(average, that.average);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentList, average);
    }

    @Override
    public String toString() {
        return "Report{" +
                "studentList=" + studentList +
                ", average=" + average +
                '}';
    }
}
