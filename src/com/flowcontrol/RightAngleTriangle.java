package com.flowcontrol;

import java.util.Scanner;

public class RightAngleTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first nonzero integer: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second nonzero integer: ");
        int b = scanner.nextInt();

        System.out.print("Enter the third nonzero integer: ");
        int c = scanner.nextInt();

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Please enter nonzero positive integers.");
        } else if (isRightTriangle(a, b, c)) {
            System.out.println("The given sides could represent a right-angled triangle.");
        } else {
            System.out.println("The given sides could not represent a right-angled triangle.");
        }
    }

    public static boolean isRightTriangle(int a, int b, int c) {
        int[] sides = {a, b, c};
        java.util.Arrays.sort(sides);

        return sides[0] * sides[0] + sides[1] * sides[1] == sides[2] * sides[2];
    }
}
