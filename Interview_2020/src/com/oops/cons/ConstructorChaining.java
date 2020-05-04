package com.oops.cons;

public class ConstructorChaining {
	int a,b;
	public ConstructorChaining() {
		this(1,2);
		System.out.println("Default Constructor");
	}
	public ConstructorChaining(int x,int y) {
		this(1,2,3);
		a=x;
		b=y;
		System.out.println("Two args constructor");
	}
	public ConstructorChaining(int a,int b,int c) {
		System.out.println("Three args constructor");
	}
	public static void main(String[] args) {
		ConstructorChaining obj = new ConstructorChaining();
		System.out.println(obj.a+" "+obj.b);
	}
}
