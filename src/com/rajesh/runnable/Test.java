package com.rajesh.runnable;

public class Test {
public static void main(String[] args) throws InterruptedException {
	MyThread t= new MyThread();
	Thread t1 = new Thread();
	t1.start();
	t1.join();
	for(int i=0 ; i<50 ; i++)
	{
		System.out.println("hi raj");
	}
}
}
