package com.oop.inheritance.studentHD;

import com.oop.medium.address.Address;

public class DemoInherit {
    public static void main(String[] args) {
        Address permanentAddress = new Address("8231 carpenter pkwy", "Irving", "Texas", 75038);
        Hostelite hostelite = new Hostelite(105, "double", 75.6f, 'H', "CSE", 4, permanentAddress);
        if (hostelite.validateStudentName()) {
            if (hostelite.validateBranchName() && hostelite.validateExamMarks()) {
                System.out.println("Student Id: " + hostelite.studentId);
                System.out.println("Student Name: " + hostelite.studentName);
                System.out.println("Qualifying Marks: " + hostelite.qualifyingExamMarks);
                System.out.println("Residential Status: " + hostelite.residentialStatus);
                System.out.println("Current Year of Engineering: " + hostelite.yearOfEngg);
                System.out.println("Branch Name: " + hostelite.branchName);
                System.out.println("Permanent Address: " + hostelite.permanentAddress.addressLine + ", " + hostelite.permanentAddress.city + ", " + hostelite.permanentAddress.state + " - " + hostelite.permanentAddress.zip);
                System.out.println("Hostel Name: " + hostelite.hostelName);
                System.out.println("Room Number: " + hostelite.roomNumber);
                System.out.println("Room Type: " + hostelite.roomType);
            }
        }
        Address residentialAddress = new Address("123 Greenway Dr", "Irving", "Texas", 75038);
        DayScholar dayScholar = new DayScholar(1254, "Timmy", 80.0f, 'D', "CSE", 4, permanentAddress, residentialAddress, 10);
        if (dayScholar.validateStudentName()) {
            if (dayScholar.validateBranchName() && dayScholar.validateExamMarks()) {
                System.out.println("Student Id: " + dayScholar.studentId);
                System.out.println("Student Name: " + dayScholar.studentName);
                System.out.println("Qualifying Marks: " + dayScholar.qualifyingExamMarks);
                System.out.println("Residential Status: " + dayScholar.residentialStatus);
                System.out.println("Current Year of Engineering: " + dayScholar.yearOfEngg);
                System.out.println("Branch Name: " + dayScholar.branchName);
                System.out.println("Residential Address: " + dayScholar.residentialAddress.addressLine + ", " + dayScholar.residentialAddress.city + ", " + dayScholar.residentialAddress.state + " - " + dayScholar.residentialAddress.zip);
                System.out.println("Distance: " + dayScholar.distance);
                System.out.println("Permanent Address: " + dayScholar.permanentAddress.addressLine + ", " + dayScholar.permanentAddress.city + ", " + dayScholar.permanentAddress.state + " - " + dayScholar.permanentAddress.zip);
            }
        }
    }
}
