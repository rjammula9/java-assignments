package com.oop.simple.studentMarks;

public class StudentMarksDemo {
    public static void main(String[] args) {
        StudentMarks student = new StudentMarks();
        student.setStudentId(1001);
        student.setQualifyingExamMarks(95.0f);
        student.setResidentialStatus('D');
        student.setYearOfEngg(2);
        System.out.println("Student Id:" + student.getStudentId());
        System.out.println("Qualifying Marks:" + student.getQualifyingExamMarks());
        System.out.println("Residential Status:" + student.getResidentialStatus());
        System.out.println("Current year of Engineering:" + student.getYearOfEngg());
    }
}
