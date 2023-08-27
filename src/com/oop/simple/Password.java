package com.oop.simple;

import java.util.Random;

public class Password {
    public static void main(String[] args) {
        String password = generateRandomPassword();
        System.out.println("Random Password: " + password);
    }

    public static String generateRandomPassword() {
        StringBuilder password = new StringBuilder();
        Random random = new Random();


        password.append((char) (random.nextInt(26) + 'a'));


        for (int i = 0; i < 7; i++) {
            if (i % 2 == 0) {
                password.append(random.nextInt(10)); // Add a random digit
            } else {
                password.append((char) (random.nextInt(26) + 'a')); // Add a random character
            }
        }

        return password.toString();
    }
}


