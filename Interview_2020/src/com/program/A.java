package com.program;

public class A {
	static void getMethod(){
		System.out.println("MethodA");
	}
	public static void main(String[] args) {
		A a = new B();
		a.getMethod();
	}
}
class B extends A{
	static void getMethod(){
		System.out.println("MethodB");
	}
}
