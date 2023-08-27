package com.flowcontrol;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int marks = scanner.nextInt();
        if (hasPassed(marks)) {
            System.out.println("Passed Successfully");
        } else {
            System.out.println("Failed! The range of the qualifying exam marks\n" +
                    "    is between 65 and 100\n");
        }
    }

    public static boolean hasPassed(int examMarks) {
        return examMarks >= 65 && examMarks <= 100;
    }
}
