package com.oops.gc;

public class Employee {
	private int Id;
	private String name;
	private int age;
	private static int nextId=1;
	
	public Employee( String name, int age) {
		super();
		Id = nextId++;
		this.name = name;
		this.age = age;
	}
	
	public void show() {
		System.out.println("Id: "+Id+" Name: "+name+" Age: "+age);
	}
	public void showNextId() {
		System.out.println("Next employee Id will be: "+nextId);
	}
}
