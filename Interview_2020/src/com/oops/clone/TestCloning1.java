package com.oops.clone;

public class TestCloning1 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Department1 dept = new Department1(1, "Human Resource");
		
		Employee1 emp1 = new Employee1(11, "Tet", dept);
		
		Employee1 emp2 = (Employee1)emp1.clone();
		
		emp1.getDepartment().setName("Finance");
		
		System.out.println(emp1.getDepartment().getName());
		System.out.println(emp2.getDepartment().getName());
	}
}
