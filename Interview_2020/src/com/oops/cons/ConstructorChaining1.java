package com.oops.cons;
/*
 The this() expression should always be the first line of the constructor.
There should be at-least be one constructor without the this() keyword (constructor 3 in above example).
Constructor chaining can be achieved in any order.
 * */
public class ConstructorChaining1 {
	
	ConstructorChaining1(){
		this(5);
		System.out.println("Default constructor...");
	}

	public ConstructorChaining1(int a) {
		this(5,15);
		System.out.println("Two Args Constructor..."+a);
	}

	public ConstructorChaining1(int a, int b) {
		System.out.println(a*b);
	}
	public static void main(String[] args) {
		new ConstructorChaining1();
	}

}
