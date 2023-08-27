package com.datatypes.arrays;

public class JaggedArray {

    public static void main(String[] args) {
        String[][] studentTutorials = {
                {"Tony", "JAVA", "C", "C++"},
                {"Thomas", "JAVA", "UNIX"},
                {"Dinil", "Linux", "Oracle"},
                {"Delvin", "RDBMS", "C#", "ORACLE"}
        };

        String studentName = "Delvin";
        displayTutorials(studentTutorials, studentName);
    }

    public static void displayTutorials(String[][] studentTutorials, String studentName) {
        int studentIndex = -1;


        for (int i = 0; i < studentTutorials.length; i++) {
            if (studentTutorials[i][0].equals(studentName)) {
                studentIndex = i;
                break;
            }
        }

        if (studentIndex != -1) {
            System.out.println(studentName + " attended the following tutorials:");
            for (int j = 1; j < studentTutorials[studentIndex].length; j++) {
                System.out.println(studentTutorials[studentIndex][j]);
            }
        } else {
            System.out.println("Student not found.");
        }
    }
}


