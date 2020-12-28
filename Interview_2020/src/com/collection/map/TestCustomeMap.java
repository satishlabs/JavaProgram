package com.collection.map;

import java.util.HashMap;
import java.util.Map;

public class TestCustomeMap {
	public static void main(String[] args) {
		final Map<Student, String> map = new HashMap<Student, String>();
		Student s1 = new Student(1, "Satish");
		Student s2 = new Student(2, "Dhoni");
		Student s3 = new Student(3, "Kohli");
		Student s4 = new Student(2, "Dhoni");
		
		map.put(s1, "IT");
		map.put(s2, "IT");
		map.put(s3, "IT");
		map.put(s4, "IT");
		
		System.out.println(map);
		
		System.out.println(map.get(s2));
	}
}
