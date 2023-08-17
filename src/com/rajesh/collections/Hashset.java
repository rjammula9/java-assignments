package com.rajesh.collections;

import java.util.HashSet;

public class Hashset {
public static void main(String[] args) {
	HashSet h = new HashSet<>();
	h.add(121);
	h.add(45 );
	h.add('d');
	h.add(null);
	h.add("madhu");
	h.add(121);
	System.out.println(h);
	System.out.println(h.size());
	System.out.println(h.contains(22));
	System.out.println(h.getClass());
	System.out.println(h.hashCode());
	System.out.println(h.clone());
	
	h.clear();
	System.out.println(h.size());
}
}
