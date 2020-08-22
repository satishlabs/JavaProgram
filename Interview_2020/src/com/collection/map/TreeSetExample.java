package com.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class TreeSetExample {
	public static void main(String[] args) {
		Employee empAmrish = new Employee(1, "Armirsh", 33);
		Employee empDharm = new Employee(3, "Dharm", 35);
		Employee empSatish = new Employee(2, "Satish", 34);
		
		TreeSet<Employee> ts = new TreeSet<>();
			ts.add(empSatish);
			ts.add(empDharm);
			ts.add(empAmrish);
			
			
		
		System.out.println(ts);
		
		Map<Integer, String> employeeMap=ts.stream().collect(Collectors.toMap(employee-> employee.getId(), employee-> employee.getName()));
		
		System.out.println(employeeMap);
		
		Map<Integer, String> empMap = new HashMap<Integer, String>();
		
		for(Employee employee : ts) {
			empMap.put(employee.getId(), employee.getName());
		}
		System.out.println(employeeMap);
	}
}
