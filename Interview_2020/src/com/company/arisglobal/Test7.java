package com.company.arisglobal;

public class Test7 {
	
	public void display(Object o) {
		System.out.println("Object");
	}
	
	public void display(String o) {
		System.out.println("Object");
	}
	
	
	public static void main(String[] args) {
		new Test7.display(null);
	}
}
