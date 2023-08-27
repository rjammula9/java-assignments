package com.collections.lists;

import java.util.ArrayList;
public class ReverseOddEven {

    public static void reverseOddAndEvenList(ArrayList<String> list) {
        int size = list.size();
        for (int i = 0; i < size - 1; i += 2) {
            String temp = list.get(i);
            list.set(i, list.get(i + 1));
            list.set(i + 1, temp);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> inputList = new ArrayList<>();
        inputList.add("how");
        inputList.add("are");
        inputList.add("you?");
        inputList.add("I");
        inputList.add("am");
        inputList.add("doing");
        inputList.add("fine");

        System.out.println("Original list: " + inputList);

        ReverseOddEven.reverseOddAndEvenList(inputList);

        System.out.println("Reversed list: " + inputList);
    }
}
