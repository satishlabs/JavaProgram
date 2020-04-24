package com.oops;

public class Test7 {
	public static void main(String[] args) {
		Test7 test = new Test7();
		try {
			System.out.println(test.divide(10,0));
		}catch (Exception e) {
			System.out.println("Division by 0");
		}
	}

	public Integer divide(int a, int b) {
	try {
		return a/b;
	}finally {
		System.out.println("Finally");
	}
	
	}
}
