package com.rajesh.abstractclass;

public abstract class Bank {
void deposit()
{
	System.out.println(" you can deposit upto 10l");
}
void withdraw()
{
	System.out.println("you can withdraw upto 50k");
}
abstract void loan();
abstract void interest();
}
