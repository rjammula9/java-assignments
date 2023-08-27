package com.flowcontrol;

public class SwitchCase {

    public static void main(String[] args) {
        char grade = 'B';

        switch (grade) {
            case 'A':
                System.out.println("Grade A: Range of marks: 80-100");
                break;
            case 'B':
                System.out.println("Grade B: Range of marks: 73-79");
                break;
            case 'C':
                System.out.println("Grade C: Range of marks: 65-72");
                break;
            case 'D':
                System.out.println("Grade D: Range of marks: 55-64");
                break;
            case 'E':
                System.out.println("Grade E: Range of marks: <55");
                break;
            default:
                System.out.println("Grade does not exist");
                break;
        }
    }
}
