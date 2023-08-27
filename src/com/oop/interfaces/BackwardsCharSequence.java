package com.oop.interfaces;

public class BackwardsCharSequence implements CharSequence {
    private String data;

    public BackwardsCharSequence(String data) {
        this.data = data;
    }

    @Override
    public int length() {
        return data.length();
    }

    @Override
    public char charAt(int index) {
        return data.charAt(data.length() - index - 1);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new BackwardsCharSequence(data.substring(data.length() - end, data.length() - start));
    }

    @Override
    public String toString() {
        StringBuilder reversed = new StringBuilder(data).reverse();
        return reversed.toString();
    }

    public static void main(String[] args) {
        String sentence = "Hello, how are you?";
        BackwardsCharSequence charSequence = new BackwardsCharSequence(sentence);

        System.out.println("Original sentence: " + sentence);
        System.out.println("Reversed sentence: " + charSequence);

        System.out.println("charAt(2): " + charSequence.charAt(2));
        System.out.println("subSequence(7, 12): " + charSequence.subSequence(7, 12));
    }
}

