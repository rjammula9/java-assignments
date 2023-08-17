package com.rajesh.multhithreading;

public class mythread extends Thread {
public synchronized void run()
{
	for (int i=0 ;i<50 ;i++)
		System.out.println("child thread is executing");
}

}
