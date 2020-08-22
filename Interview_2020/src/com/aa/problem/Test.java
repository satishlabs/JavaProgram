package com.aa.problem;

public class Test {
	static void method1(Object a) {
		System.out.println("a");
	}
	static void method1(String b) {
		System.out.println("b");
	}
	
	public static void main(String[] args) {
		method1(null);
	}
}
