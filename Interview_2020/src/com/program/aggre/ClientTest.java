package com.program.aggre;

public class ClientTest {
	public static void main(String[] args) {
		aggregationDemo();
		System.out.println("++++++++++++++++++++++++++++++++++++");
		compositionDemo();
	}
	
	//Is-A
	private static void compositionDemo() {
		Person person = new Person();
		person.setPid(1202);
		person.setFirstname("MS");
		person.setLastname("Dhoni");
		person.getAddress().setCity("Bangalore");
		person.getAddress().setState("KA");
		
		System.out.println(person);
		System.out.println(person.getAddress());
		person = null;
		System.out.println("---------------------------------------");
		System.out.println(person);
		if(person != null)
			System.out.println(person.getAddress());
		else 
			System.out.println("Address doesnt exists...");
	}
	//Has-A
	private static void aggregationDemo() {
		Address address = new Address();
		address.setCity("Ranchi");
		address.setState("JH");
		
		Employee emp = new Employee();
		emp.setEmpId(11);
		emp.setFirstname("Satish");
		emp.setLastname("Prasad");
		emp.setAge(30);
		emp.setAddress(address);
		
		System.out.println(emp);
		System.out.println(address);
		emp = null;
		System.out.println("---------------------------------");
		System.out.println(emp);
		System.out.println(address);
	}
}
