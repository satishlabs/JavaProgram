package com.jdk8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
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
		
		System.out.println();
		System.out.println("======================================");
		Optional<Employee> emp = empList.stream().filter(e->e.getName().equalsIgnoreCase("Dhoni")).findAny();
		if(emp.isPresent()) {
			System.out.println(emp.get());
		}
		
		System.out.println();
		System.out.println("======================================");
		OptionalInt maxAge = empList.stream().mapToInt(Employee::getAge).max();
		if(maxAge.isPresent()) {
			System.out.println("Max age of emp: "+maxAge);
		}
		
		System.out.println();
		System.out.println("======================================");
		empList.sort((e1,e2)->e1.getAge()-e2.getAge());
		empList.forEach(System.out::println);
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
