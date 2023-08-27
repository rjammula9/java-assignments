package com.introduction;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Name:");
        String firstname = sc.nextLine();
        System.out.println("Enter the Last Name:");
        String lastname = sc.nextLine();
        System.out.println("enter the age:");
        int age = sc.nextInt();
        System.out.println("Enter the First Name:" + firstname);
        System.out.println("Enter the Last Name:" + lastname);
        System.out.println("Enter the Age:" + age);
    }

}
