package com.collec;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class SortMapByKeys {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("Math", "Satish");
		map.put("Data Structure", "Kapil");
		map.put("Java", "Manish");
		map.put("Operating System", "test");
		map.put("Aperating System", "Abhi");
		map.put("Networking", "Kundan");
		
		/*map.forEach((k,v)->{
			System.out.println("key: "+k+" value: "+v);
		});*/
		System.out.println("Sorted by keys");
		Map<String, String> map1 = new TreeMap<>(map);
		map1.forEach((k,v)->{
			System.out.println("key: "+k+" value: "+v);
		});
		//System.out.println(map);
		System.out.println("-------------------------------------------------");
		System.out.println("Sorted by values");
		
		
		 Map<Integer, String> sortedMap = sortByValues(map); 
		 System.out.println("After Sorting:");
	      Set set2 = sortedMap.entrySet();
	      Iterator iterator2 = set2.iterator();
	      while(iterator2.hasNext()) {
	           Map.Entry me2 = (Map.Entry)iterator2.next();
	           System.out.print(me2.getKey() + ": ");
	           System.out.println(me2.getValue());
	      }
	}

	public static Map<Integer, String> sortByValues(Map<String, String> map) {
		List<Map.Entry<String, String>> entryList = new LinkedList<>(map.entrySet());
	/*	Collections.sort(entryList, new Comparator<Map.Entry<String, String>>() {

			@Override
			public int compare(Entry<String, String> o1, Entry<String, String> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});*/
		Collections.sort(entryList,(o1,o2)->o1.getValue().compareTo(o2.getValue()));
		 HashMap sortedHashMap = new LinkedHashMap();
		 Iterator itr = entryList.iterator();
		 while(itr.hasNext()){
			 Map.Entry<String, String> entry = (Entry<String, String>) itr.next();
			 sortedHashMap.put(entry.getKey(), entry.getValue());
		 }
		return sortedHashMap;
	}
}
