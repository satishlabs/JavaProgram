package com.oops.gc;

public class UseEmployee {
	public static void main(String[] args) {
		Employee emp = new Employee("Satish", 30);
		Employee emp1 = new Employee("Manish", 14);
		Employee emp2 = new Employee("Kaushilk", 19);
		
		emp.show();
		emp1.show();
		emp2.show();
		
		emp.showNextId();
		emp1.showNextId();
		emp2.showNextId();
		System.out.println("=====================================================");
		
		{
			Employee emp3 = new Employee("Kapil", 36);
			Employee emp4 = new Employee("Ms", 46);
			emp3.show();
			emp4.show();
			
			emp3.showNextId();
			emp4.showNextId();
		}
		System.out.println("--------------------------------------------------------");
		emp.showNextId();
	}
}
