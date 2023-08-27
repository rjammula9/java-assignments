package com.introduction;

public class MethodRefactor {
    public static int add(int i, int j) {
        return i + j;
    }

    public static void print(String name, String city, String title, String company) {
        System.out.println("Hello,my name is" + name);
        System.out.println("I Live in" + city);
        System.out.println("I am a" + title);
        System.out.println("I Work for" + company);
    }

    public static void main(String[] args) {

        // Refactor the following 4 lines as a method & make the
        // name, city and state as parameters to the method.
        for (int i = 0; i < 3; i++) {
            print("Boot Camp", "Dallas, TX", "java instructor", "Nivtek");
        }


        int i = 5, j = 6;

        // Refactor the line below to create an add method.
        int k;
        k = add(i, j);

        System.out.println(k);
        k = add(4, 7);
        System.out.println(k);
    }
}
