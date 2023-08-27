package com.rajesh.collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class Treemap {
public static void main(String[] args) {
	TreeMap<Integer, String > hm= new TreeMap<>();
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
	System.out.println(hm.size());
	System.out.println(hm.clone());
	System.out.println(hm.keySet());
	System.out.println(hm.values());
	System.out.println(hm.containsKey(232));
	
}
}
