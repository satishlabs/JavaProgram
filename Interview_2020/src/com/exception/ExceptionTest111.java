package com.exception;

public class ExceptionTest111 {
	public static void main(String[] args) {
		try {
			int i = 10/0;
		}catch (ArithmeticException e) {
			System.out.println("Exception handled - ArithmeticException");
		}catch (RuntimeException e) {
			System.out.println("Exception Handled - RuntimeException");
		}catch (Exception e) {
			System.out.println("Exceptin Handled - Exception");
		}
	}
}
