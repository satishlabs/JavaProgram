package com.collection.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class RemovieDuplicateValue {
	public static void main(String[] args) {
		HashMap<Integer, String> map= new HashMap<Integer, String>();
		map.put(1, "Tarun");
		map.put(2, "Abhisek");
		map.put(3, "Rakesh");
		map.put(4, "Tarun");
		map.put(5, "Rakesh");
		
		Collection<String> list = map.values();
		for(Iterator<String> itr = list.iterator(); itr.hasNext();) {
			if(Collections.frequency(list, itr.next())>1) {
				itr.remove();
			}
		}
		System.out.println(map);
	}
}
