package com.rajesh.strings;

public class Stringdemo {
public static void main(String[] args) {
	String str="java Application";
	System.out.println(str);
	str.concat("Development");
	System.out.println(str);
	String str1 = str.concat(" Development");
	System.out.println(str1);
	System.out.println(str1.toUpperCase());
	System.out.println(str1.toLowerCase());
	System.out.println(str1.equals("Java Application Development"));
	System.out.println(str1.equalsIgnoreCase("Java Application Development"));
	System.out.println(str1.getClass());
	System.out.println(str1.isEmpty());
}
}
