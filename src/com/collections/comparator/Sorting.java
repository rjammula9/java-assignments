package com.collections.comparator;

import java.util.*;

class Sorting {

    public static void main(String[] args) {
        int listSize = 30;
        int magnitude = 500;
        Random rand = new Random();

        ArrayList<Integer> numbers = new ArrayList<Integer>(listSize);
        for (int i=0; i < listSize; i++) {
            numbers.add(rand.nextInt() % magnitude);
        }

        Collections.sort(numbers);

        System.out.println("Sorted numbers in ascending order:");
        for (Integer num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Part (b): Sorting in reverse order using BackwardOrdering
        Collections.sort(numbers, new BackwardOrdering());

        System.out.println("\nSorted numbers in reverse order:");
        for (Integer num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Part (c): Sorting with alternating ordering using AlternatingOrdering
        Collections.sort(numbers, new AlternatingOrdering());

        System.out.println("\nSorted numbers with alternating ordering:");
        for (Integer num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

class BackwardOrdering implements Comparator<Integer> {
    public int compare(Integer a, Integer b) {
        return b.compareTo(a);
    }
}

class AlternatingOrdering implements Comparator<Integer> {
    public int compare(Integer a, Integer b) {
        if (a >= 0 && b >= 0) {
            return a.compareTo(b);
        } else if (a < 0 && b < 0) {
            return b.compareTo(a);
        } else {
            return Integer.compare(b, a);
        }
    }
}

