package com.rajesh.multhithreading;

public class Test {
	public synchronized static void main(String[] args)  {
		mythread t =new mythread();
		t.start();
		
		for (int i=0 ;i<50 ;i++)
		{
			System.out.println("main thread is executing");
		}
	}

}
