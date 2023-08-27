package com.flowcontrol;

import java.util.Scanner;

public class Encrypt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 4 digit COde:");
        int input = scanner.nextInt();
        int encryptedNumber = encrypt(input);
        System.out.println("Encrypted number:" + encryptedNumber);


    }

    public static int encrypt(int number) {
        int[] digits = new int[4];
        for (int i = 0; i <= 3; i++) {
            digits[i] = (number % 10 + 7) % 10;
            number /= 10;
        }
        int encryptedNumber = digits[2] * 1000 + digits[3] * 100 + digits[0] * 10 + digits[1];
        return encryptedNumber;

    }
}
