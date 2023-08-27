package com.rajesh.collections;

import java.util.Enumeration;
import java.util.Vector;

public class enumerationDemo {
public static void main(String[] args) {
	Vector v = new Vector <>();
	v.addElement(101);
	v.addElement(45);
	v.addElement('d');
	v.addElement("test");
	v.addElement(null);
	v.addElement(101);
	
	Enumeration e =v.elements();
	while(e.hasMoreElements())
	{
		System.out.println(e.nextElement());
	}
}
}
