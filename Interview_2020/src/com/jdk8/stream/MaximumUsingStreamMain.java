package com.jdk8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class MaximumUsingStreamMain {
	public static void main(String[] args) {
		List<Employee> employeeList = createEmployeeList();
		
		//Given a list of employees, you need to filter all the employee whose age is greater than 20 and print the employee names
		List<String> empNameList = employeeList.stream().filter(e -> e.getAge()>30).map(Employee::getName)
											.collect(Collectors.toList());
		empNameList.forEach(name -> System.out.println(name));
		
		//Given the list of employees, count number of employees with age 25?
		long count = employeeList.stream().filter(e -> e.getAge()>30).count();
		System.out.println("Count :"+count);
		
		//Given the list of employees, find the employee with name “Satish”.
		Optional<Employee> e1 = employeeList.stream().filter(e -> e.getName().equalsIgnoreCase("SATISH")).findAny();
		if(e1.isPresent())
				System.out.println(e1);
		//Given a list of employee, find maximum age of employee?
		OptionalInt max = employeeList.stream().mapToInt(Employee::getAge).max();
		if(max.isPresent())
			System.out.println("Maximum age of Employee: "+max.getAsInt());
		
		//Given a list of employees, sort all the employee on the basis of age
		//You can simply use sort method of list to sort the list of employees.

		employeeList.sort((e2,e3)->e2.getAge()-e3.getAge());
		employeeList.forEach(System.out::println);
		
		System.out.println();
		//Join the all employee names with “,” using java 8?
		List<String> employeeNameStr = employeeList.stream().map(Employee::getName).collect(Collectors.toList());
		String empNames = String.join(", ", employeeNameStr);
		System.out.println("Employees are: "+empNames);
	}

	private static List<Employee> createEmployeeList() {
		List<Employee> employeeList = new ArrayList<>();
		Employee e1 = new Employee(1, "Satish", 33, 50000);
		Employee e2 = new Employee(2, "Ms", 37, 100000);
		Employee e3 = new Employee(3, "Virat", 30, 40000);
		Employee e4 = new Employee(4, "Rohit", 29, 70000);
		
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		
		return employeeList;
	}
}
