package com.flowcontrol;

import java.util.Scanner;

public class PrintSquares {
        public static void HollowSquare(int size) {
            if (size < 1 || size > 20) {
                System.out.println("Please enter a side length between 1 and 20.");
                return;
            }

            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the size of the side of the square (1-20): ");
            int size = scanner.nextInt();

            if (size >= 1 && size <= 20) {
                HollowSquare(size);
            } else {
                System.out.println("Please enter a valid side length between 1 and 20.");
            }

            scanner.close();
        }


}
