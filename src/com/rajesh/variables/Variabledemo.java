package com.rajesh.variables;

public class Variabledemo {
int a=45; //instance 
int b=15;
 static int x=30; // static variable
 static int y=15;
 void add()
 {
	 int m=20; // local
	 int n=30;
	 int p=m+n;
	 System.out.println(" addition of local variables :"+p);
 }
 public static void main(String[] args) {
	Variabledemo vd= new Variabledemo();
	int c=vd.a+vd.b;
	System.out.println(" addition of instance variables :"+c);
	int z=x+y;
	System.out.println(" addition of static variables :"+z);
	vd.add();
}
}
