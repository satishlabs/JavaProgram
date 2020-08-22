package com.oops;

public class Child extends Parent{
	public Number connect(A2 a2){
		System.out.println("Child");
		return null;
	}
	
	public static void main(String[] args) {
		Parent p = new Child();
		p.connect(new A3());
	}
}
