package com.exception;

public class FinallyExample {
	public static void main(String[] args) {
		try {
			int x=300;
			throw new ArithmeticException();
			//System.out.println("x: "+x); 
		}catch (Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("finally block is executed");
		}
	}
}
