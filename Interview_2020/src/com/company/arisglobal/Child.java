package com.company.arisglobal;

class Parent{
	Parent(int i){
		System.out.println("Parent Constructor...");
	}
}

public class Child extends Parent{
	Child() {
		//super(i);
		System.out.println("Child Constructor...");
	}
	
	public static void main(String[] args) {
		Parent p = new Child();
	}
}
