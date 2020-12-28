package com.test;

class A{
	public static void test() {
		System.out.println("A");
	}
}

public class B extends A{
	public static void test() {
		System.out.println("B");
	}
	
	public static void main(String[] args) {
		B b = new B();
		b.test();
		A a = new B();
		a.test();
		//B b1 = new A();
		//b1.test();
	}
}


