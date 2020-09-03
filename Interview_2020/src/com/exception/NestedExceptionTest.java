package com.exception;

public class NestedExceptionTest {
	public static void main(String[] args) {
		try {
			int i = 10/0;//will throw ArithmeticException
		}catch (ArithmeticException e) {
			System.out.println("try-catch block handled - ArithmeticException");
			
			//using nested try-catch block
			try {
				String s = null;
				s.charAt(0); //will throw NullPointerException
			}catch (NullPointerException npe) {
				System.out.println("NESTED try-catch block hanled -"+ "NullPointerException");
			}
		}
	}
}
