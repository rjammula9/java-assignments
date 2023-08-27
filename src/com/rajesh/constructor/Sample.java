package com.rajesh.constructor;

public class Sample {
Sample() // defualt
{
	System.out.println("daulf constructor");
	
}
Sample( int a, int b) //paramterized 
{
	this();
	int c=a+b;
	System.out.println(" a+b value is :"+c); // this will be called pervious owns 
	
}
Sample( int a, int b, int c) // overloading
{
	this(a,b);
	int d= a+b+c;
	System.out.println(" a+b+c value is :"+d);
}

}
