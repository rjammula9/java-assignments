package com.collections.lists.fruit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListOfFruit {
    public static void main(String[] args){
        ArrayList<String> fruitsList = new ArrayList<>();
        fruitsList.add("pear");
        fruitsList.add("banana");
        fruitsList.add("tangerine");
        fruitsList.add("strawberry");
        fruitsList.add("blackberry");
        System.out.println("elements are(in order of insertion):");
        displayListUsingIterator(fruitsList);
        System.out.println("\nelements are(in resverse order of insertion):");
        displayListInReverseUsingIterator(fruitsList);
        fruitsList.add(3,"banana");
        System.out.println("\nsecond elements are:");
        displayListUsingIterator(fruitsList);
    }
    public static void displayListUsingIterator(ArrayList<String> list){
        Iterator<String> iterator= list.iterator();
        while (iterator.hasNext()){
            System.out.println(" "+iterator.next());
        }
    }
    public static void displayListInReverseUsingIterator(ArrayList<String> list){
        ListIterator<String> listIterator= list.listIterator(list.size());
        while(listIterator.hasPrevious()){
            System.out.println(" "+ listIterator.previous());
        }
    }
}
