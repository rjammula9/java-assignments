package com.collections.comparator.employee;

public class Employee {
   private String firstName;
    private String lastName;
    private int age;
    private char gender;
    private double salary;
    public Employee(String firstName,String lastName, int age, char gender, double salary){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.gender=gender;
        this.salary=salary;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + gender + " " + age + " " + salary;
    }
}
