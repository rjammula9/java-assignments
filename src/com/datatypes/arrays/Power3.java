package com.datatypes.arrays;

import java.lang.Math;

public class Power3 {

    public int[] generatePowers(int base, int n) {
        if (base < 0) {
            throw new IllegalArgumentException("base must be a non-negative integer");
        }

        int[] powers = new int[n + 1];
        for (int power = 0; power <= n; power++) {
            powers[power] = (int) Math.pow(base, power);
        }
        return powers;
    }

    public static void powers(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Power3 powerGenerator = new Power3();
        int[] powers = powerGenerator.generatePowers(3, 6);
        powers(powers);
    }
}
