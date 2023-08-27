package com.oop.overLoading;

import java.util.Date;

public class Employee {
    private String firstName;
    private String lastName;
    private int employeeId;
    private Date dateOfBirth;

    public Employee(String firstName) {
        this(firstName, "", 0, null);
    }

    public Employee(String firstName, String lastName) {
        this(firstName, lastName, 0, null);
    }

    public Employee(String firstName, String lastName, int employeeId) {
        this(firstName, lastName, employeeId, null);
    }

    public Employee(String firstName, String lastName, int employeeId, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeId = employeeId;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("John");
        Employee emp2 = new Employee("Jane", "Doe");
        Employee emp3 = new Employee("Michael", "Smith", 12345);
        Employee emp4 = new Employee("Emily", "Johnson", 67890, new Date());


        System.out.println("Employee 1: " + emp1.getFullName() + ", ID: " + emp1.getEmployeeId());
        System.out.println("Employee 2: " + emp2.getFullName() + ", ID: " + emp2.getEmployeeId());
        System.out.println("Employee 3: " + emp3.getFullName() + ", ID: " + emp3.getEmployeeId());
        System.out.println("Employee 4: " + emp4.getFullName() + ", ID: " + emp4.getEmployeeId() + ", DOB: " + emp4.getDateOfBirth());
    }


    public String getFullName() {
        return firstName + " " + lastName;
    }

    // Other getters and setters (implement them as needed)
}
