package com.collection.map;

import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentNavigableMapTest {
	public static void main(String[] args) {
		ConcurrentNavigableMap map = new ConcurrentSkipListMap<>();
		map.put("1", "one");
		map.put("2", "two");
		map.put("3", "three");
		
		System.out.println(map);
		
		ConcurrentNavigableMap headMap = map.headMap("2");
		System.out.println("HeadMap: "+headMap);
		
		ConcurrentNavigableMap tailMap = map.tailMap("2");
		System.out.println("TailMap: "+tailMap);
		
		ConcurrentNavigableMap subMap = map.subMap("2", "3");
		System.out.println("Submap: "+subMap);
		
	}

	
}
