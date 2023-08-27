package com.oop.inheritance.studentHD;

import com.oop.medium.address.Address;

public class Hostelite extends StudentHD {
    String hostelName;
    int roomNumber;
    String roomType;

    public Hostelite(int roomNumber, String roomType, float qualifyingExamMarks, char residentialStatus, String branchName, int yearOfEngg, Address permanentAddress) {
        super(roomNumber, roomType, qualifyingExamMarks, residentialStatus, branchName, yearOfEngg, permanentAddress);
        this.hostelName = hostelName;
        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }

    public void setHostelName(String hostelName) {
        this.hostelName = hostelName;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getHostelName() {
        return hostelName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }
}

