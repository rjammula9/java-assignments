package com.javaLang.strings1;

public class Demo {

        public static void main(String[] args) {
            Student3 studentOne = new Student3();

            studentOne.setStudentId(1001);
            studentOne.setStudentName("Jackson");
            studentOne.setQualifyingExamMarks(95.0f);
            studentOne.setResidentialStatus('D');
            studentOne.setYearOfEngg(2);
            studentOne.setBranchName("CSE");

            if (studentOne.validateStudentName() && studentOne.validateBranchName()) {
                studentOne.validateExamMarks();
                studentOne.displayStudentDetails();
            }

            Student3 studentTwo = new Student3();

            studentTwo.setStudentId(1002);
            studentTwo.setStudentName("Jen");
            studentTwo.setQualifyingExamMarks(68.0f);
            studentTwo.setResidentialStatus('H');
            studentTwo.setYearOfEngg(3);
            studentTwo.setBranchName("ABC");

            if (studentTwo.validateStudentName() && studentTwo.validateBranchName()) {
                studentTwo.validateExamMarks();
                studentTwo.displayStudentDetails();
            }
        }


}
