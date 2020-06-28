package com.exception;

import java.io.IOException;

public class ExceptionTest {
	public int method1() {
		System.out.println("Method");
		try {
			System.out.println("Retuern - 1");
			return 1;
		}catch (Exception e) {
			System.out.println("Return - 2");
			return 2;
		} /*
			 * catch (IOException e) { System.out.println(e.getMessage()); }
			 */
		finally {
			System.out.println("Return - 3");
			return 3;
		}
	}
	public static void main(String[] args) {
		
		ExceptionTest obj = new ExceptionTest();
		
		int a = obj.method1();
		System.out.println(a);
		
	}
}
