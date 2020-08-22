package com.collection.map.custom;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "Satish");
		Employee emp2 = new Employee(1, "Satish");
		HashMap<Employee, String> map = new HashMap<>();
		
		map.put(emp1, "1st");
		map.put(emp2, "2nd");
		
		map.forEach((a,b)->System.out.println(a.getId()+" "+a.getName()));
		
		Iterator itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry entry = (Entry) itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}
