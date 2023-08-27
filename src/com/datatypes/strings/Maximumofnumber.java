
package com.datatypes.strings;

public class Maximumofnumber {


    public static void main(String[] args) {
        String input = "324, 457, 112, 259, 323, 222";
        String[] numbers = input.split(", ");

        int maxSum = 0;
        int[] maxSumNumbers = new int[2]; // To store the two numbers with the max sum

        for (String numStr : numbers) {
            int num = Integer.parseInt(numStr);
            int sum = calculateDigitSum(num);

            if (sum > maxSum) {
                maxSum = sum;
                maxSumNumbers[0] = num;
            } else if (sum == maxSum) {
                maxSumNumbers[1] = num;
            }
        }

        System.out.println("Numbers with the max digit sum:");
        for (int number : maxSumNumbers) {
            if (number != 0) {
                System.out.println(number);
            }
        }
    }

    public static int calculateDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }


}
