package com.collec;

import java.util.HashSet;
import java.util.Set;

public class EmpTest {
	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "AA","12");
		Employee emp2 = new Employee(1, "AA","12");
		
		if(emp1.hashCode() == emp2.hashCode()) {
			if(emp1.equals(emp2)) {
				System.out.println("Both are equals");
			}else {
				System.out.println("Both objects are not eqauls!!!");
			}
		}else {
			System.out.println("Both objects are not equal@@");
		}
		
		Set<Employee> empSet = new HashSet<Employee>();
		empSet.add(emp1);
		empSet.add(emp2);
		
		System.out.println(empSet);
	}
}
