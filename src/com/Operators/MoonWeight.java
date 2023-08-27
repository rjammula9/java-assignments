package com.Operators;

import java.util.Scanner;

public class MoonWeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Weight on Earth:kg");
        double earth = scanner.nextLong();
        double moon = earth * 1.7;
        System.out.println("The weight on Moon is:kg" + moon);


    }
}
