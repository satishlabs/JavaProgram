package com.company.arisglobal;

public class TestException {
	public static void main(String[] args) {
		method();
	}

	private static void method() {
		try {
			System.out.println("A");
			m2();
			System.out.println("C");
		}catch (Exception e) {
			System.out.println("D");
		}
	}

	private static void m2() {
		try {
			System.out.println("B");
			int a=10/0;
		}finally {
			System.out.println("E");
		}
		
	}
}
