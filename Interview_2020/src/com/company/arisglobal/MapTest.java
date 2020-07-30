package com.company.arisglobal;

import java.util.HashMap;

public class MapTest {
	public static void main(String[] args) {
		HashMap hm = new HashMap<>();
		hm.put(new Student(), 10);
		hm.put(new Student(), 20);
		
		System.out.println(hm);
		
		System.out.println(hm.get(new Student()));
	}
}
