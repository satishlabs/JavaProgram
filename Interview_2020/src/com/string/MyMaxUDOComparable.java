package com.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyMaxUDOComparable {
	public static void main(String[] args) {
		 List<Employee> emps = new ArrayList<Employee>();
	        emps.add(new Employee(10, "Raghu", 25000));
	        emps.add(new Employee(120, "Krish", 45000));
	        emps.add(new Employee(210, "John", 14000));
	        emps.add(new Employee(150, "Kishore", 24000));
	        Collections.sort(emps);
	        System.out.println(emps);
	        Employee maxSal = Collections.max(emps);
	        System.out.println("Employee with max salary: "+maxSal);
	}
}
