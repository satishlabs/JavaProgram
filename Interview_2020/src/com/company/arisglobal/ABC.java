package com.company.arisglobal;

public class ABC {
	public static void main(String[] args) {
		new ABC().get(10);
	}

	 void get(long i) {
		System.out.println("Inside long");
	}
	 void get(double d) {
			System.out.println("Inside double");
		}
}
