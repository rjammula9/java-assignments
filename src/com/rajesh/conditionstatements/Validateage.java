package com.rajesh.conditionstatements;

import java.util.Scanner;

public class Validateage {
void check()
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter age:");
	int age = sc.nextInt();
	if(age>=18)
	{
		System.out.println("eligible to vote");
	}
	else 
		System.out.println(" not eligibile");
}
public static void main(String[] args) {
	{
		Validateage age= new Validateage();
		age.check();
	}
}
}
