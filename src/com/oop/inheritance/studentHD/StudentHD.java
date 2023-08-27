package com.oop.inheritance.studentHD;

import com.oop.medium.address.Address;

public class StudentHD {
    int studentId;
    String studentName;
    float qualifyingExamMarks;
    char residentialStatus;
    String branchName;
    Address permanentAddress;
    int yearOfEngg;

    public StudentHD(String studentName, float qualifyingExamMarks, char residentialStatus, String branchName, int yearOfEngg, Address permanentAddress) {

        this.studentName = studentName;
        this.qualifyingExamMarks = qualifyingExamMarks;
        this.residentialStatus = residentialStatus;
        this.branchName = branchName;
        this.permanentAddress = permanentAddress;
        this.yearOfEngg = yearOfEngg;
    }

    public StudentHD(int roomNumber, String roomType, float qualifyingExamMarks, char residentialStatus, String branchName, int yearOfEngg, Address permanentAddress) {
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setQualifyingExamMarks(float qualifyingExamMarks) {
        this.qualifyingExamMarks = qualifyingExamMarks;
    }

    public void setResidentialStatus(char residentialStatus) {
        this.residentialStatus = residentialStatus;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public void setPermanentAddress(Address permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public void setYearOfEngg(int yearOfEngg) {
        this.yearOfEngg = yearOfEngg;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public float getQualifyingExamMarks() {
        return qualifyingExamMarks;
    }

    public char getResidentialStatus() {
        return residentialStatus;
    }

    public String getBranchName() {
        return branchName;
    }

    public Address getPermanentAddress() {
        return permanentAddress;
    }

    public int getYearOfEngg() {
        return yearOfEngg;
    }


    public boolean validateStudentName() {

        return false;
    }

    public boolean validateBranchName() {
        return false;
    }

    public boolean validateExamMarks() {
        return false;
    }

}

