package com.oop.simple.studentMarks;

public class StudentMarks {
    private int studentId;
    private float qualifyingExamMarks;
    private char residentialStatus;
    private int yearOfEngg;

    public StudentMarks() {
    }

    public void setStudentId(int Id) {
        studentId = Id;
    }

    public void setQualifyingExamMarks(float examMarks) {
        qualifyingExamMarks = examMarks;
    }

    public void setResidentialStatus(char status) {
        residentialStatus = status;
    }

    public void setYearOfEngg(int year) {
        yearOfEngg = year;
    }

    public int getStudentId() {
        return studentId;
    }

    public char getResidentialStatus() {
        return residentialStatus;
    }

    public float getQualifyingExamMarks() {
        return qualifyingExamMarks;
    }

    public int getYearOfEngg() {
        return yearOfEngg;
    }
}
