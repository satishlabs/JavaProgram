package com.collec;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class SecondHighestInList {
	public static void main(String[] args) {
		// Get Min or Max Number
		Integer maxNumber = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
		                    .max(Comparator.comparing(Integer::valueOf))
		                    .get();
		 
		Integer minNumber = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
		                    .min(Comparator.comparing(Integer::valueOf))
		                    .get();
		 
		System.out.println("maxNumber = " + maxNumber);
		System.out.println("minNumber = " + minNumber);
		System.out.println("========================");
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(20);
		list.add(30);
		list.add(18);
		list.add(56);
		list.add(25);
		Optional<Integer> ele= list.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst();
		if(ele.isPresent()) {
			System.out.println(ele.get());
		}
		
		
		
		System.out.println();
		System.out.println(list.removeIf(n ->(n == 18)));
		System.out.println(list);
		
		
		
		System.out.println("===============================");
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "Satish", "33"));
		employees.add(new Employee(2, "Dhoni", "39"));
		employees.add(new Employee(3, "Virat", "20"));
		
		Comparator<Employee> empCompare = Comparator.comparing(Employee::getAge);
		
		Employee minAgeEmp = employees.stream().min(empCompare).get();
		Employee maxAgeEmp = employees.stream().max(empCompare).get();
		
		System.out.println(minAgeEmp+" , and  "+maxAgeEmp);
	}	
}
