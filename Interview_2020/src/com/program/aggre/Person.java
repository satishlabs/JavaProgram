package com.program.aggre;

public class Person {
	private int pid;
	private String firstname;
	private String lastname;
	private Address address;
	
	//composition exmaple
	//Here addess content within the Person
	public Person() {
		address = new Address();
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Address getAddress() {
		return address;
	}


	@Override
	public String toString() {
		return "Person [pid=" + pid + ", firstname=" + firstname + ", lastname=" + lastname + ", address=" + address
				+ "]";
	}
	
}
