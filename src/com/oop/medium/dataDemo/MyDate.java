package com.oop.medium.dataDemo;

public class MyDate {
    private int month;
    private int day;
    private int year;


    public MyDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;

    }


    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }


    // Getters
    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }


    public void displayDate() {
        System.out.println(month + "/" + day + "/" + year);
    }
}
