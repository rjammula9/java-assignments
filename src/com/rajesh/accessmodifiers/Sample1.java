package com.rajesh.accessmodifiers;

public class Sample1 {
protected  int a=45;
protected void show()
{
	System.out.println("private data cannot be accessed outside the class");
}
public static void main(String[] args)
{
	
	Sample1 sample1 = new Sample1();
	System.out.println("a value is :"+sample1.a);
	sample1.show();
	
}
}
