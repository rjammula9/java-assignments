package com.oop.simple;

public class Employee {
    private int employeeId;
    private char gender;
    private float allowance;
    private double basicSalary;

    public void setEmployee(int empId) {
        employeeId = empId;
    }

    public void setGender(char empGender) {
        gender = empGender;
    }

    public void setAllowances(float empAllowances) {
        allowance = empAllowances;
    }

    public void setBasicSalary(double empBasicSalary) {
        basicSalary = empBasicSalary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Gender: " + gender);
        System.out.println("Allowances: " + allowance);
        System.out.println("Basic Salary: " + basicSalary);
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setEmployee(123);
        employee.setGender('M');
        employee.setAllowances(1000.0f);
        employee.setBasicSalary(50000.0);

        employee.displayDetails();
    }

}
