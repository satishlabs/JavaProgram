package com.program;

import java.util.HashMap;
import java.util.Iterator;

public class Sample {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("1", "One");
		map.put("2", "Two");
		map.put("3", "Three");
		map.put("4", "Four");
		
		System.out.println("Iterating javaIterator");
		Iterator<String> itr = map.keySet().iterator();
		while(itr.hasNext()) {
			String key = itr.next();
			map.put("5", "Five");
			System.out.println(key);
		}
	}
}
