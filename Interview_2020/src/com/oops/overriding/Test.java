package com.oops.overriding;
class A{
	int i=10;
	public void printValue() {
		System.out.println("Value-A");
	};
}
class B extends A{
	int i=12;
	public void printValue() {
		System.out.println("Value-B");
	}
}
public class Test {
	public static void main(String[] args) {
		A a = new B();
		a.printValue();
		System.out.println(a.i);
	}
}
