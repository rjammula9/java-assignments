package com.rajesh.collections;

import java.util.ArrayList;

public class arraylistdemo {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(121);
		a1.add(45,56);
		
		a1.add(null);
		
		a1.add(121);
		System.out.println(a1);
		System.out.println(a1.size());
		System.out.println(a1.isEmpty());
		System.out.println(a1.get(2));
		System.out.println(a1.clone());
		System.out.println(a1.getClass());
		System.out.println(a1.hashCode());
		System.out.println(a1.contains(22));
		a1.remove(1);
		System.out.println(a1);
		System.out.println(a1.size());
		System.out.println(a1.toString());
		a1.clear();
		System.out.println(a1.size());
		System.out.println(a1.isEmpty());
		System.out.println(a1.toString());
	}

}
