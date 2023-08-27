package com.oop.simple.student;

public class Student {
    private int studentId;
    private  char studentType;


    public void setStudentId(int Id) {
        studentId = Id;
    }
    public void setStudentType(char Type){
        studentType=Type;
    }

    public int getStudentId() {
        return studentId;
    }

    public char getStudentType() {
        return studentType;
    }
}
