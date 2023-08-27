package com.collections.lists.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMemu {
    private static ArrayList<Student> studentList = new ArrayList<>();
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            printMenu();
            int choice = getChoice();
            switch (choice) {
                case 1:
                    addStudent();
                    break;

                case 2:
                    displayAllStudents();
                    break;
                case 3:
                    searchStudentById();
                    break;

                case 4:
                    searchStudentByLastName();
                    break;
                case 5:
                    modifyStudentGpa();
                    break;
                case 6:
                    removeStudentById();
                    break;
                case 7:
                    exitProgram();
                    break;
                default:
                    System.out.println("Invalid choice.Please enter a valid option.");
            }
        }

    }

        private static void printMenu(){
            System.out.println("Student Menu:");
            System.out.println("1 - Add new student");
            System.out.println("2 - Display all students");
            System.out.println("3 - Search for student (by id)");
            System.out.println("4 - Search for student (by last name)");
            System.out.println("5 - Modify a student's GPA");
            System.out.println("6 - Remove student (by id)");
            System.out.println("7 - Exit");
            System.out.print("Please enter your choice: ");
    }
    private static int getChoice(){
        return scanner.nextInt();
    }
    private static void addStudent(){
        System.out.println("Enter the student ID:");
        int id= scanner.nextInt();
        scanner.nextLine();
        if(studentIdExists(id)){
            System.out.println("Error: id already exists");
            return;
        }
        System.out.print("Enter student first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter student last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter student GPA: ");
        double gpa = scanner.nextDouble();
        scanner.nextLine();  // Consume the newline character

        studentList.add(new Student(id, firstName, lastName, gpa));
        System.out.println("Student added successfully.");


    }
    private static boolean studentIdExists(int Id){
        for(Student student : studentList) {
            if (student.getId() == Id) {
                return true;
            }
        }
            return false;

    }
    private static void displayAllStudents(){
        if(studentList.isEmpty()){
            System.out.println("No students in the lists.");
        }else{
            System.out.println("List of all students:");
            for(Student student : studentList){
                System.out.println(student);
            }
        }
    }
    private static void searchStudentById(){
        System.out.println("Enter studentId to search:");
        int searchId= scanner.nextInt();
        scanner.nextLine();
        for(Student student: studentList){
            if(student.getId() == searchId){
                System.out.println("Found student:");
                System.out.println(student);
                return;
            }

        }
        System.out.println("Student with ID " + searchId + " not found.");

    }
    private static void searchStudentByLastName(){
        System.out.println("Enter studentLastName to search:");
        String searchLastName= scanner.nextLine();
      Student s=   studentList.stream()
                .filter(student -> student.getLastName().equals(searchLastName))
                .findFirst().get();
//        for(Student student: studentList){
//            if(student.getLastName() == searchLastName){
//                System.out.println("Found student:");
//                System.out.println(student);
//                return;
//            }
//
//        }
        if(s!=null){
            System.out.println("Found student:");
                System.out.println(s);
        }
        else {
            System.out.println("Student with Last Name " + searchLastName + " not found.");
        }

    }
    private static void modifyStudentGpa(){
        System.out.println("Enter student Id to modify GPA:");
        int searchId= scanner.nextInt();
        scanner.nextLine();
        for (Student student : studentList){
            if (student.getId()==searchId){
                System.out.print("Enter new GPA for student: ");
                double newGpa = scanner.nextDouble();
                student.setGpa(newGpa);
                System.out.println("Student's Gpa Modified Successfully.");
                return;
            }
        }
        System.out.println("Student with ID " + searchId + " not found.");
    }
private static void removeStudentById(){
        System.out.print("Enter student Id to remove:");
        int searchId= scanner.nextInt();
        scanner.nextLine();
        for (int i=0;i<studentList.size();i++){
            if(studentList.get(i).getId()==searchId){
                studentList.remove(i);
                System.out.println("Student removed successfully.");
                return;
            }
        }
    System.out.println("Student with ID " + searchId + " not found.");
}
private static void exitProgram(){
    System.out.println("Exiting the program.");
    scanner.close();
    System.exit(0);
}
}
