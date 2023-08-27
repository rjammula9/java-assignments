package com.collections.lists.arrayList;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private double gpa;
    public Student (int id, String firstName, String lastName,double gpa){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.gpa=gpa;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getGpa() {
        return gpa;
    }
    public String toString(){
        return "ID:" +id+", Name:" + firstName + " "+ lastName+ ",GPA" +gpa;
    }
}

