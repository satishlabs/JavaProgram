package com.collec;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;

public class TesthashTable {
	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable<>();
		//ht.put(null, "v1");
		//ht.put("key", null);
		//Hashtable does not allow null keys or values
		System.out.println(ht);
		
		HashMap<String, String> map = new HashMap<>();
		map.put(null, "value");
		map.put("key", null);
		
		System.out.println(map);
		
		List list = new ArrayList<>();
		list.add(1);
		list.add(4);
		list.add(3);
		
		System.out.print(list);
		
		list = new LinkedList<>();
		list.add(1);
		list.add(4);
		list.add(3);
		
		System.out.print(list);
	}
}
