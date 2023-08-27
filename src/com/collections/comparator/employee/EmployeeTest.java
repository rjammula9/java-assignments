package com.collections.comparator.employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Bob", "Smith", 25, 'M', 20000));
        employees.add(new Employee("Alice", "Johnson", 20, 'F', 2000));
        employees.add(new Employee("Robert", "Williams", 30, 'M', 500));
        employees.add(new Employee("Alice", "Brown", 25, 'F', 1500));


        Collections.sort(employees, Comparator.comparing(Employee::getFirstName));

        System.out.println("Sorted by first name:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println();
        Collections.sort(employees, Comparator.comparingInt(Employee::getAge));

        System.out.println("Sorted by age:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println();

        // Sort employees by salary
        Collections.sort(employees, Comparator.comparingDouble(Employee::getSalary));

        System.out.println("Sorted by salary:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
