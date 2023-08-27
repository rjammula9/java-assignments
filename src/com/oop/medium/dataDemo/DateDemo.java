package com.oop.medium.dataDemo;

public class DateDemo {
    public static void main(String[] args) {

        MyDate date = new MyDate(8, 18, 2023);


        System.out.print("Initial Date: ");
        date.displayDate();

        date.setMonth(9);
        date.setDay(1);
        date.setYear(2024);


        System.out.print("Updated Date: ");
        date.displayDate();
    }
}
