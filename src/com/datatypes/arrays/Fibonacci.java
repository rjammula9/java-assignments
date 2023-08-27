package com.datatypes.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println("Enter the length of Fibonacci series:");
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        if (input < 0) {
            System.out.println("Number should be positive number");
        } else {
            List<Integer> sequence = generateFibonacciSequence(input);
            System.out.println(sequence);
        }


    }

    public static List<Integer> generateFibonacciSequence(int n) {
        List<Integer> sequence = new ArrayList<>();
        sequence.add(1);
        sequence.add(2);

        for (int i = 2; i < n; i++) {
            int nextNumber = sequence.get(i - 1) + sequence.get(i - 2);
            sequence.add(nextNumber);
        }

        return sequence;
    }
}
