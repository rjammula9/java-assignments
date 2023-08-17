package com.rajesh.abstractclass;

public class Test {
public static void main(String[] args) {
	//Bank bank= new Bank();
	icicibank bank =new icicibank();
	bank.deposit();
	bank.withdraw();
	bank.loan();
	bank.interest();


	HDFCbank bank1 =new HDFCbank();
	bank1.deposit();
	bank1.withdraw();
	bank1.loan();
	bank1.interest();
}
}
