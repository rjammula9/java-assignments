package com.oop.simple.student;

public class CourseManagement {
    public static void main(String[] args){
        int tempStudentId=1234;
        char tempStudentType='A';
        Student student=new Student();
        student.setStudentId(tempStudentId);
        student.setStudentType(tempStudentType);
        System.out.println("Student ID is:"+ student.getStudentId());
        System.out.println("Student Type is:" +student.getStudentType());
    }
}
