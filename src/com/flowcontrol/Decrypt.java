package com.flowcontrol;

import java.util.Scanner;

public class Decrypt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 4 digit Code of Encrypted:");
        int encryptedNumber = scanner.nextInt();
        int decryptedNumber = dencrypt(encryptedNumber);
        System.out.println("]Decrypted number:" + decryptedNumber);


    }

    public static int dencrypt(int encryptedNumber) {
        int[] digits = new int[4];
        for (int i = 0; i <= 3; i++) {
            digits[i] = (encryptedNumber % 10 + 3) % 10;
            encryptedNumber /= 10;
        }
        int dencryptedNumber = digits[2] * 1000 + digits[3] * 100 + digits[0] * 10 + digits[1];
        return dencryptedNumber;

    }
}


