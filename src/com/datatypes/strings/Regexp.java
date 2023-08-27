package com.datatypes.strings;

import java.util.Scanner;

public class Regexp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a telephone number:");
        String phonenumber = scanner.nextLine();
        if (isVaildPhonenumber(phonenumber)) {
            System.out.println("Vaild telephone number");
        } else {
            System.out.println("Not Valid Telephone Number");
        }
        System.out.println("Enter Vaild IP address:");
        String IPaddress = scanner.nextLine();
        if (isVaildIPaddress(IPaddress)) {
            System.out.println("Vaild IPAddress");
        } else {
            System.out.println("Not Vaild IP Address");
        }
        System.out.println("Enter Vaild Email address:");
        String Emailaddress = scanner.nextLine();
        if (isVaildEmailaddress(Emailaddress)) {
            System.out.println("Vaild EmailAddress");
        } else {
            System.out.println("Not Vaild EmailAddress");
        }
    }

    public static boolean isVaildPhonenumber(String phonenumber) {
        return phonenumber.matches("\\d{3}[-.\\s]\\d{3}[-.\\s]\\d{4}");

    }

    public static boolean isVaildIPaddress(String IPaddress) {
        return IPaddress.matches("(\\d|\\d{2}|\\d{3})\\.(\\d|\\d{2}|\\d{3})\\.(\\d|\\d{2}|\\d{3})\\.(\\d|\\d{2}|\\d{3})");
    }

    public static boolean isVaildEmailaddress(String EmailAddress) {
        return EmailAddress.matches("[A-Za-z]+@[A-Za-z]+\\.com");
    }
}
