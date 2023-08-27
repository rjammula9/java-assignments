package com.javaLang.strings3;

public class DemoLogin {
    public static void main(String[] args) {
        Login login = new Login();

        if (login.validateLogin()) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Denied");
        }
    }
}

