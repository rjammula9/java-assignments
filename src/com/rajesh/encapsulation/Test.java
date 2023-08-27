package com.rajesh.encapsulation;

public class Test {
public static void main(String[] args) {
	Employee employee = new Employee();
	employee.setId(10);
	employee.setName("madhu");
	employee.setSalary(45000);
	System.out.println("Employee ID :"+employee.getId());
	System.out.println("Employee Nmae"+employee.getName());
	System.out.println("employee salary"+employee.getSalary());
}
}
