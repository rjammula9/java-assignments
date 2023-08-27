package com.rajesh.metodoverloading;

public class Test {
public static void main(String[] args) {
	Sample sample= new Sample();
	sample.add();
	sample.add(12, 15);
	sample.add(45, 25, 50);
	sample.add(12.55f, 625.25f);
}
}
