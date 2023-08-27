package com.oop.medium.employee;

public class EmployeeDemo {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Rajesh", "Jammula", 7000);
        Employee employee2 = new Employee("Ravi", "Reddy", 9000);

        System.out.println("First Name: " + employee1.getFirstName());
        System.out.println("Last Name: " + employee1.getLastName());
        System.out.println("Monthly:$ " + employee1.getMonthlySalary());
        System.out.println("Yearly salary: $" + employee1.getYearlySalary());
        System.out.println("First Name: " + employee2.getFirstName());
        System.out.println("Last Name: " + employee2.getLastName());
        System.out.println("Monthly:$ " + employee2.getMonthlySalary());
        System.out.println("Yearly salary: $" + employee2.getYearlySalary());
        employee1.giveRaise();
        employee2.giveRaise();
        System.out.println("First Name: " + employee1.getFirstName());
        System.out.println("Last Name: " + employee1.getLastName());
        System.out.println("Monthly:$ " + employee1.getMonthlySalary());
        System.out.println("Yearly salary: $" + employee1.getYearlySalary());
        System.out.println("First Name: " + employee2.getFirstName());
        System.out.println("Last Name: " + employee2.getLastName());
        System.out.println("Monthly:$ " + employee2.getMonthlySalary());
        System.out.println("Yearly salary: $" + employee2.getYearlySalary());




    }



}
