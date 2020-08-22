package com.oops.clone;

public class TestCloning {
	public static void main(String[] args) throws CloneNotSupportedException {
		Department dept = new Department(1, "Human Resource");
		Employee emp1 = new Employee(11, "Satish", dept);
			

        //Lets create a clone of original object emp1
		Employee emp2 = (Employee) emp1.clone();
		
		System.out.println(emp2.getEmployeeId());
		
		System.out.println(emp1 != emp2);
		

        //As we are returning same class; so it should be true
        System.out.println(emp1.getClass() == emp2.getClass());
		
		//Default equals method checks for references so it should be false. If we want to make it true,
        //then we need to override equals method in Employee class.
		System.out.println(emp1.equals(emp2));
		
		System.out.println("==================================================================");
		 //Let change the department name in cloned object and we will verify in original object
		emp2.getDepartment().setName("Finance");
		System.out.println("Original: "+emp1.getDepartment().getName());
		System.out.println("CLoned: "+emp2.getDepartment().getName());
	}
}
