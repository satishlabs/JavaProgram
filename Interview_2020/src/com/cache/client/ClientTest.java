package com.cache.client;


import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.cache.lru.LRUCache;
import com.cache.model.Department;
import com.cache.model.Employee;

public class ClientTest {
	public static void main(String[] args) {
		Employee e1 = new Employee(1001, "Dhoni", 50000.0, "ms@gmail");
		Employee e2 = new Employee(1002, "Kohli", 57000.0, "k@gmail");
		Employee e3 = new Employee(1003, "Sachin", 150000.0, "sa@gmail");
		Employee e4 = new Employee(1004, "Rohit", 603000.0, "rohit@gmail");
		Employee e5 = new Employee(1005, "KL", 150000.0, "kl@gmail");
		
		Department d1 = new Department(2001, "IT", "Boston");
		Department d2 = new Department(2002, "Finance", "Ranchi");
		
		LRUCache<Employee, Department> cache = LRUCache.newInstance(2);
		
		cache.put(e1, d1);
		cache.put(e2, d1);
		cache.put(e3, d1);
		
		cache.put(e4, d2);
		cache.put(e5, d2);
		
		Set<Entry<Employee, Department>> entrySet = cache.entrySet();
		for (Map.Entry<Employee, Department>  entry: entrySet) {
			Employee employee = entry.getKey();
			Department department = entry.getValue();
			System.out.println(employee);
			System.out.println(department);
			
		}
	}
}
