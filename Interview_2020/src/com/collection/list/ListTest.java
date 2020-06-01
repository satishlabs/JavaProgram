package com.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		
		Employee emp = new Employee(2,"Satish");
		
		List list = new ArrayList<>();
		list.add(12);
		list.add("saa");
		list.add(16.60);
		list.add(emp);
		
		list.forEach(lst -> System.out.println(lst));
	}
}
