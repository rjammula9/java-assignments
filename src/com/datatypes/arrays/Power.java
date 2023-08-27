package com.datatypes.arrays;

import java.lang.Math;

public class Power {

    public Power(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be a non-negative integer");
        }

        int[] powers = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            powers[i] = (int) Math.pow(2, i);
        }
        powers(powers);
    }

    public static void powers(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Power powerGenerator = new Power(5);
    }
}
//Using the logic from part 1 create a method using the following method signature:
//public Int[] power (int base, int power);
//This method should give you all of the exponential values of the ‘base’ to ‘power’.
//For example:
//if we pass the base as 3 and the power as 5, the method should hold the values for the following:
//30=1;
//31=3;
//32=9;
//33=27;
//34=81;
