package com.program.aggreation;

public class Student {
	String name;
	int id;
	String dept;
	
	public Student(String name, int id, String dept) {
		this.name = name;
		this.id = id;
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
}
