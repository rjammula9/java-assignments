package com.javaLang.strings1;

public class Student3 {
        private int studentId;
        private String studentName;
        private float qualifyingExamMarks;
        private char residentialStatus;
        private int yearOfEngg;
        private String branchName;



        public boolean validateStudentName() {
            if (studentName.length() < 5 || studentName.length() > 25) {
                System.out.println("The length of the name should be minimum 5 characters and a maximum of 25 characters");
                return false;
            }
            return true;
        }

        public boolean validateBranchName() {
            String[] validBranches = {"CSE", "ECE", "EEE", "MECH", "Bio-Tech"};
            boolean isValid = false;
            for (String validBranch : validBranches) {
                if (branchName.equalsIgnoreCase(validBranch)) {
                    isValid = true;
                    break;
                }
            }
            if (!isValid) {
                branchName = "CSE";
                System.out.println("Invalid Branch Name, set to CSE");
                return false;
            }
            return true;
        }

        public void validateExamMarks() {
            if (qualifyingExamMarks < 65 || qualifyingExamMarks > 100) {
                System.out.println("Invalid marks, the range of marks is between 65 and 100");
            }
        }

        public void displayStudentDetails() {
            System.out.println("Student Id: " + studentId);
            System.out.println("Student Name: " + studentName);
            System.out.println("Qualifying Marks: " + qualifyingExamMarks);
            System.out.println("Residential Status: " + residentialStatus);
            System.out.println("Current Year of Engineering: " + yearOfEngg);
            System.out.println("Branch Name: " + branchName);
        }


    public void setYearOfEngg(int yearOfEngg) {
        this.yearOfEngg = yearOfEngg;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setResidentialStatus(char residentialStatus) {
        this.residentialStatus = residentialStatus;
    }

    public void setQualifyingExamMarks(float qualifyingExamMarks) {
        this.qualifyingExamMarks = qualifyingExamMarks;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getYearOfEngg() {
        return yearOfEngg;
    }

    public String getBranchName() {
        return branchName;
    }

    public char getResidentialStatus() {
        return residentialStatus;
    }

    public float getQualifyingExamMarks() {
        return qualifyingExamMarks;
    }
}
