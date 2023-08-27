package com.oop.medium;

public class IntegerWrapper {
    private int a;

    private IntegerWrapper(int a) {
        this.a = a;
    }

    public void swap(IntegerWrapper other) {
        int Temp = this.a;
        this.a = other.a;
        other.a = Temp;
    }

    public static void main(String[] args) {
        IntegerWrapper wrapper1 = new IntegerWrapper(5);
        IntegerWrapper wrapper2 = new IntegerWrapper(10);
        System.out.println("Before Swap:");
        System.out.print("Wrapper:1" + wrapper1.a + " ");
        System.out.println("Wrapper2: " + wrapper2.a);
        wrapper1.swap(wrapper2);
        System.out.println("After Swap:");
        System.out.print("Wrapper1:" + wrapper1.a + " ");
        System.out.println("Wrapper2: " + wrapper2.a);


    }
}
