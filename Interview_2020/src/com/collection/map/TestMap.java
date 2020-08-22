package com.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class TestMap {
	public static void main(String[] args) {
		Map<String, String> myMap = new HashMap<>();
		myMap.put("k1", "101");
		myMap.put("k2", "50");
		myMap.put("k10", "13");
		myMap.put("k4", "20");
		myMap.put("k3", "109");
		myMap.put("k8", "78");
		myMap.put("k22", "81");
		
		//Map->Filter->String
		String result = myMap.entrySet().stream().filter(e->"50".equals(e.getValue()))
					.map(e->e.getValue()).collect(Collectors.joining());
		System.out.println("The Filter result: "+result);
		
		//Map ->Filter ->Map
		Map<String, String> collect = myMap.entrySet().stream().filter(map->"k10".equals(map.getKey()))
				.collect(Collectors.toMap(p->p.getKey(), p->p.getValue()));
		System.out.println(collect);
	}
}
