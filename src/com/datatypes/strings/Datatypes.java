package com.datatypes.strings;

public class Datatypes {

    public static void main(String[] args) {

        double sum = 10 + 40 + 142.5 + 333.62;
        System.out.println("The sum of four number is:" + sum);
        int a = 45;
        int b = -21;
        int c = a + b;
        int d = a - b;
        int e = a * b;
        double f = a / b;
        System.out.println("the sum is:" + c);
        System.out.println("the sub is:" + d);
        System.out.println("the multiplication is:" + e);
        System.out.println("the div is:" + f);
        String value = "Hello how are you";
        System.out.println(value);
        char charValue = 'H';
        System.out.println(charValue);
        long longValue = 1234567890L;
        int intValue = (int) longValue;
        System.out.println("intValue: " + intValue);
        int longvalue = 123;
        System.out.println(longvalue);

        int[] intArray = new int[10];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = 1;
        }
        System.out.println(intArray);
        char[] charArray = new char[26];
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) ('a' + i);
        }
        System.out.println(charArray);
        int[][] intTable = new int[7][5];
        System.out.println(intTable);
        String StringValuetoConvert = "10";
        int intValueConvert = Integer.parseInt(StringValuetoConvert);
        System.out.println(intValueConvert);
    }
}