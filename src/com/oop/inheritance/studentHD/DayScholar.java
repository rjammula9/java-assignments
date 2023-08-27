package com.oop.inheritance.studentHD;

import com.oop.medium.address.Address;

public class DayScholar extends Hostelite {
    Address residentialAddress;
    float distance;
    public DayScholar(int studentId,String studentName, float qualifyingExamMarks, char residentialStatus, String branchName, int yearOfEngg, Address permanentAddress, Address residentialAddress, int distance) {
        super(studentId,studentName, qualifyingExamMarks, residentialStatus, branchName, yearOfEngg, permanentAddress);
        this.residentialAddress = residentialAddress;
        this.distance = distance;
    }

    public void setResidentialAddress(Address residentialAddress) {
        this.residentialAddress = residentialAddress;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public Address getResidentialAddress() {
        return residentialAddress;
    }

    public float getDistance() {
        return distance;
    }
}

