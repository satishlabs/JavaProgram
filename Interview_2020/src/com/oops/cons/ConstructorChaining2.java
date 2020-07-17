package com.oops.cons;

public class ConstructorChaining2 {
	// default constructor 1 
	ConstructorChaining2(){
		System.out.println("default");
	}
	// parameterized constructor 2 
	ConstructorChaining2(int a){
		// invokes default constructor
		this();
		System.out.println(a);
	}
	ConstructorChaining2(int a,int b){
		this(5);
		System.out.println(a*b);
	}
	public static void main(String[] args) {
		new ConstructorChaining2(5,10);
	}
}
