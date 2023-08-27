package com.flowcontrol;

import java.util.Scanner;

public class Salesbyperson {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of items sold:");
        int numberOfItems = scanner.nextInt();
        double totalSales = 0.0;

        for (int i = 1; i <= numberOfItems; i++) {
            System.out.print("Enter the value of item " + i + ": $");
            double itemValue = scanner.nextDouble();
            totalSales += itemValue;
        }

        double totalEarnings = calculateEarnings(totalSales);
        System.out.println("Total earnings: $" + totalEarnings);

        scanner.close();
    }

    public static double calculateEarnings(double totalSales) {
        double baseSalary = 200.0;
        double bonusRate = 0.09;
        double commission = totalSales * bonusRate;

        double totalEarnings = baseSalary + commission;
        return totalEarnings;
    }
}

