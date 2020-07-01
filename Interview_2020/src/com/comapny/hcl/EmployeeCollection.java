package com.comapny.hcl;

import java.util.ArrayList;

public class EmployeeCollection {
	ArrayList<Employee> employeeCollection = new ArrayList<>();
	
	private ArrayList<Employee> createEmployee(){
		employeeCollection.add(new Employee(1, "Satish", 50000, 1));
		employeeCollection.add(new Employee(2, "Ms", 35000, 1));
		employeeCollection.add(new Employee(3, "Rohit", 75000, 2));
		employeeCollection.add(new Employee(4, "Virat", 40000, 3));
		return employeeCollection;
		
	}
	
	public Employee addEmployee(Employee empToAdd) {
		boolean flag = true;
		if(employeeCollection.isEmpty()) {
			//return flag;
		}
		
		return empToAdd;
		
	}
	

	
	public static void main(String[] args) {
		EmployeeCollection employee = new EmployeeCollection();
		//employee.createEmployee();
		
		for(Employee emp: employee.createEmployee()) {
			System.out.println(emp);
		}
	}
}
