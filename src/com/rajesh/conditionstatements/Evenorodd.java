package com.rajesh.conditionstatements;

import java.util.Scanner;

public class Evenorodd {
void check()
{
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the value");
	int number=sc.nextInt();
	
	if(number%2 == 0)
	{
		System.out.println("even number");
		
	}
	else {
		System.out.println("odd number");
	}
}
public static void main(String[] args) {
	{
		Evenorodd number = new Evenorodd();
		number.check();
	}
}
}
