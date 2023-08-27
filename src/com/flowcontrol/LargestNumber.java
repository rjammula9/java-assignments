package com.flowcontrol;


import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        int largest = 0;

        while (counter <= 10) {
            System.out.print("Enter number " + counter + ": ");
            int number = scanner.nextInt();

            if (number > largest) {
                largest = number;
            }

            counter++;
        }

        System.out.println("The largest number is: " + largest);

        scanner.close();
    }
}
