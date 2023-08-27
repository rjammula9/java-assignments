package com.rajesh;

public class BigInitialsName {
    public static void main(String[] args) {
        printNameWithInitials("John X Doe");
    }

    private static void printNameWithInitials(String name) {
        String[] initials = name.split(" ");
        for (String initial : initials) {
            printBigLetter(initial.charAt(0));
            System.out.print("   ");
        }
        System.out.println();
        System.out.println(name);
    }

    private static void printBigLetter(char letter) {
        switch (letter) {
            case 'J':
                System.out.println("  J  ");
                System.out.println("  J  ");
                System.out.println("  J  ");
                System.out.println("J J  ");
                System.out.println(" JJ  ");
                break;
            case 'X':
                System.out.println("X   X");
                System.out.println(" X X ");
                System.out.println("  X  ");
                System.out.println(" X X ");
                System.out.println("X   X");
                break;
            case 'D':
                System.out.println("DDD  ");
                System.out.println("D  D ");
                System.out.println("D   D");
                System.out.println("D  D ");
                System.out.println("DDD  ");
                break;
            default:
                // Handle other letters here
                break;
        }
    }
}

