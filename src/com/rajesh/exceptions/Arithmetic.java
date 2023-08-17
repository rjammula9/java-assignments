package com.rajesh.exceptions;

import java.util.Scanner;

public class Arithmetic {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	{
		System.out.println("Enter a value");
		int a = sc.nextInt();
		System.out.println("Enter b value");
		int b = sc.nextInt();
		int c=a+b;
		int d=a-b;
		int e=a*b;
		int f=a/b;
		System.out.println("a+b value is: "+c);
		System.out.println("a-b value is: "+d);
		System.out.println("a*b value is: "+e);
		System.out.println("a/ b value is: "+f);
	}
}
}
