package com.flowcontrol;

import java.util.Scanner;

public class CreditLimit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the AccountNumber:");
        int accountNumber = scanner.nextInt();
        System.out.println("Enter the balance:");
        double balance = scanner.nextDouble();
        System.out.println("Enter the Number of Items:");
        int numberOfItems = scanner.nextInt();
        double totalIteamValues = 0.0;

        for (int i = 1; i <= numberOfItems; i++) {
            System.out.print("Enter the value of item " + i + ": $");
            double itemValue = scanner.nextDouble();
            totalIteamValues += itemValue;
        }
        System.out.println("Enter the number of Credits:");
        int credits = scanner.nextInt();
        double totalCredits = 0.0;

        for (int j = 1; j <= credits; j++) {
            System.out.print("Enter the value of credit " + j + ": $");
            double creditValue = scanner.nextDouble();
            totalCredits += creditValue;
        }
        System.out.println("Enter the CreditLimit:");
        int creditLimit = scanner.nextInt();
        double newBalance = calculateCharges(balance, totalCredits, totalIteamValues);
        System.out.println("Total earnings: $" + newBalance);

        if (newBalance > creditLimit) {
            System.out.println("Credit limit exceeded");
        }else{
            System.out.println("Credit not exceeded");
        }
        scanner.close();
    }

    public static double calculateCharges(double balance, double totalCredits, double totalIteamValues) {
        double newBalance = balance + totalIteamValues-totalCredits;

        return newBalance;
    }
}
