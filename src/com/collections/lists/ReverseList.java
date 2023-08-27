package com.collections.lists;


import java.util.ArrayList;

public class ReverseList {
    public static void reverseList(ArrayList<String> list) {
        ArrayList<String> reversedList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String originalString = list.get(i);
            String reversedString = reverseString(originalString);
            list.set(i, reversedString);
        }
    }

    private static String reverseString(String str) {

        return new StringBuffer(str).reverse().toString();

    }


    public static void main(String[] args){
        ArrayList<String> inputList= new ArrayList<>();
        inputList.add("how");
        inputList.add("are");
        inputList.add("you?");
        System.out.println("Original list: " + inputList);
        ReverseList.reverseList(inputList);
        System.out.println("Reversed list: " + inputList);
    }
}
