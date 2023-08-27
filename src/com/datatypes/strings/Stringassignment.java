package com.datatypes.strings;

public class Stringassignment {

    public static void main(String[] args) {
        String str = "hello how are you?";
        int wordCount = str.split(" ").length;
        System.out.println("Number of words: " + wordCount);
        int length = str.length();
        System.out.println("Length of the strings is :" + length);
        String replacedHELLO = str.replace("hello", "HELLO");
        System.out.println("Replaced words:" + replacedHELLO);
        String replace = str.replace(" ", ",");
        System.out.println("Replace with space with coma :" + replace);
        String firstThreeChars = str.substring(0, 3);
        System.out.println("First 3 characters: " + firstThreeChars);
        //2. Compare whether below strings are equal or not
        String str1 = "Hello";
        String str2 = "HELLO";
        boolean areEqual = str1.equalsIgnoreCase(str2);
        System.out.println("Strings are equal: " + areEqual);
        //3. Check palindrome
        String palindromeStr = "NITIN";
        boolean ispalindromestr = palindromeStr.equals(new StringBuilder(palindromeStr).reverse().toString());
        System.out.println("is palindrome:" + ispalindromestr);
        //4. Find all the occurrences of A in the below string
        String str3 = "HELLO HOW ARE YOU AND WHERE ARE YOU";
        int occurrencesOfA = str3.length() - str3.replace("A", "").length();
        System.out.println("Occurrences of 'A': " + occurrencesOfA);
        //Check whether “institute” word is present in the below sentence.  If it exists, replace first 3 characters of institute with JSS.
        //		This  is a java institute of insurance and insu.
        String str4 = "This  is a java institute of insurance and insu";
        if (str4.contains("institute")) {
            String replacedWord = str4.replaceFirst("ins", "JSS");
            System.out.println("After replacement: " + replacedWord);
        } else {
            System.out.println("'institute' not found in the sentence.");
        }

    }
}
