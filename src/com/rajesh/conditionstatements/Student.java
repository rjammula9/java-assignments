package com.rajesh.conditionstatements;

import java.util.Scanner;

public class Student {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter m1 marks");
	int m1 =sc.nextInt();
	System.out.println("Enter m2 marks");
	int m2 =sc.nextInt();
	System.out.println("Enter m3 marks");
	int m3 =sc.nextInt();
	System.out.println("Enter m4 marks");
	int m4 =sc.nextInt();
	System.out.println("Enter m5 marks");
	int m5 =sc.nextInt();
	System.out.println("Enter m6 marks");
	int m6 =sc.nextInt();
	int total=m1+m2+m3+m4+m5+m6;
	float avg=total/6;
	System.out.println("total marks:"+total);
	System.out.println("average marks :"+avg);
	
	if(avg >= 80)
	{
		System.out.println("A grade");
	
	}
	else if(avg >= 70 && avg < 80)
	{
		System.out.println("b grade");
	
	}
	else if(avg >= 60 && avg < 70)
	{
		System.out.println("c grade");
	
	}
	else
	{
		System.out.println(" F grade");
	
	}
}
}
