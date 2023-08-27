package com.rajesh.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import java.util.Iterator;

public class Hashmap {
public static void main(String[] args) {
	HashMap<Integer, String> hm = new HashMap<>();
	hm.put(121, "madhu");
	hm.put(101, "shiav");
	hm.put(45, "me");
	hm.put(60, "ravi");
	Set set = hm.entrySet();
	Iterator itr =set.iterator();
	while(itr.hasNext())
	{
		Map.Entry entry = (Map.Entry)itr.next();
	System.out.println(entry.getKey()+" "+entry.getValue());	
	}
	
}
}
