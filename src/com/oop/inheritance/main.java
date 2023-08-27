package com.oop.inheritance;

public class main {
    public static void main(String[] args) {
        Freshman student1 = new Freshman("F123", "Alice", 18, 1);
        MastersStudent student2 = new MastersStudent("M567", "Bob", 24, "Masters of Science");
        DoctoralStudent student3 = new DoctoralStudent("D567", "Raj", 30, "Doctor in science");

        System.out.println(student1.getName() + " is a " + student1.getYear() + " year undergraduate student.");
        System.out.println(student2.getName() + " is a " + student2.getDegree() + " graduate student.");
        System.out.println(student3.getName() + " is a " + student3.getDegree() + " Doctoral student.");
    }
}

