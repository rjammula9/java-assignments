package com.oop.medium;

public class Validations {
    // Instance variables
    private String studentName;
    private String branchName;

    // Constructor
    public Validations(String studentName, String branchName) {
        this.studentName = studentName;
        this.branchName = branchName;
    }

    // Getters and Setters
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    // Method to validate student name
    public boolean validateStudentName() {
        if (studentName.length() >= 5 && studentName.length() <= 25) {
            return true;
        } else {
            System.out.println("The length of the name should be minimum 5 characters and a maximum of 25 characters");
            return false;
        }
    }

    // Method to validate branch name
    public boolean validateBranchName() {
        String[] validBranches = {"CSE", "ECE", "EEE", "MECH", "Bio-Tech"};
        for (String validBranch : validBranches) {
            if (branchName.equalsIgnoreCase(validBranch)) {
                return true;
            }
        }
        System.out.println("Invalid Branch Name, set to CSE");
        return false;


    }

    public static void main(String[] args) {
        // Create an object of Student class
        Validations studentOne = new Validations("John Doe", "CSE");

        // Validate student name and branch name
        if (studentOne.validateStudentName() && studentOne.validateBranchName()) {
            System.out.println("Student name and branch name are valid.");
        } else {
            System.out.println("Student name or branch name is invalid.");
        }
    }


}
