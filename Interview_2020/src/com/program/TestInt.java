package com.program;

import java.util.HashMap;
import java.util.Map;

public class TestInt {
	public static void main(String[] args) {
		Integer a = new Integer(10);
		Integer b = new Integer(10);
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
		
		
		Map<Integer, String> map = new HashMap<>();
		map.put(a, "aa");
		map.put(b, "bb");
		
		System.out.println(map);
		
		
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		Map<String, Integer> map1 = new HashMap<>();
		map1.put(s1, 10);
		map1.put(s2, 20);
		System.out.println(map1);
	}
}
