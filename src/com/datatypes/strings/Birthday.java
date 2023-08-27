package com.datatypes.strings;

import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the birthday format MM/DD/YY :");
        String birthday = scanner.nextLine();
        String[] parts = birthday.split("/");
        if (parts.length == 3) {
            String Month = parts[0];
            String Day = parts[1];
            String Year = parts[2];
            System.out.println("Month:" + Month);
            System.out.println("Day:" + Day);
            System.out.println("Year:" + Year);

        } else {
            System.out.println("you entered the Wrong Input");
        }

    }
}
