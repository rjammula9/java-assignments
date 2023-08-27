package com.Operators;

import java.util.Scanner;

public class TemperatureConvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Celsius value:");
        double celsius = scanner.nextLong();
        double fahrenheit = celsius * 9 / 5 + 32;
        System.out.println("The Fahrenheit value is:" + fahrenheit);
        System.out.println("Enter the Fanhrenheit value:");
        double fahrenheit1 = scanner.nextLong();
        double celsius1 = (fahrenheit1 - 32) * 5 / 9;
        System.out.println("The Celsius value is:" + celsius1);

    }
}
