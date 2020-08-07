package com.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StudentTest {
	public static void main(String[] args) {
		Student stud1 = new Student(1, "Satish");
		Student stud2 = new Student(1, "Satish");
		
		Map<Student, String> map = new HashMap<Student, String>();
		map.put(stud1, "AA");
		map.put(stud2, "BB");
		
		map.forEach((k,v)->System.out.println(k+" "+v));
		
		List<Student> l1 = new ArrayList<>();
		l1.add(stud1);
		l1.add(stud2);
		System.out.println(l1.size());
		
		Set<Student> s1 = new HashSet<>();
		s1.add(stud1);
		s1.add(stud2);
		System.out.println(s1.size());
	}
}
