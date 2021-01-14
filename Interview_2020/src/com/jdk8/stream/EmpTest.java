package com.jdk8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmpTest {
	public static void main(String[] args) {
		
		List<Employee> empList = createEmpList();
		List<String> empFilterList = empList.stream()
						.filter(e->e.getAge()>30)
						.map(Employee::getName)
						.collect(Collectors.toList());
		System.out.println(empFilterList);
		
		System.out.println();
		System.out.println("======================================");
		long count = empList.stream()
					.filter(e->e.getAge()>30)
					.count();
		System.out.println("Emp Count age>30 :"+count);
	}
	
	public static List<Employee> createEmpList(){
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("Satish", 33));
		empList.add(new Employee("Kohli", 30));
		empList.add(new Employee("Dhoni", 41));
		empList.add(new Employee("Mayank", 22));
		empList.add(new Employee("Pant", 25));
		
		return empList;
	}
}
