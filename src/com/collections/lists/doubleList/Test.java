package com.collections.lists.doubleList;

import java.util.ArrayList;



public class Test {


    public void testDoubleList() {
        ArrayList<String> inputList = new ArrayList<>();
        inputList.add("how");
        inputList.add("are");
        inputList.add("you?");

        DoubleList.doubleList(inputList);

        ArrayList<String> expectedList = new ArrayList<>();
        expectedList.add("how");
        expectedList.add("how");
        expectedList.add("are");
        expectedList.add("are");
        expectedList.add("you?");
        expectedList.add("you?");


    }
    public static void main(String[] args) {
        ArrayList<String> inputList = new ArrayList<>();
        inputList.add("how");
        inputList.add("are");
        inputList.add("you?");

        System.out.println("Original list: " + inputList);

        DoubleList.doubleList(inputList);

        System.out.println("Doubled list: " + inputList);
    }
}
