package com.datatypes.strings;

public class RegexTutorial {
    public static void main(String[] args) {
        String input = "Mso@@hot\\mail..com";
        String output = changeString(input);

        System.out.println(output);
    }

    public static String changeString(String input) {
        String temp;
        temp = input.replaceAll("\\\\", "");
        temp = temp.replaceAll("\\.\\.", ".");
        temp = temp.replaceAll("@@", "@");
        return temp;
    }

}
