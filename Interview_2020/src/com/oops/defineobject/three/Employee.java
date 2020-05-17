package com.oops.defineobject.three;

//Defining object of a class as the parameter of the method.

public class Employee {
	String name;
	int id;
	String address;
	public Employee(String name, int id, String address) {
		this.name = name;
		this.id = id;
		this.address = address;
	}
	
	public boolean compareEmpIds(Employee emp) {
		if(this.id == emp.id) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Employee emp1 = new Employee("Satish", 11, "Ranchi");
		Employee emp2 = new Employee("MsDhoni", 11, "Ranchi");
		
		boolean check = emp1.compareEmpIds(emp2);
		System.out.println(check); //true
		// If id will same , it will return true 
		//If id will different , it will return false;
	}
	
}
