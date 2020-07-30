package com.exception;


//return statement in try block and end of the method
public class TryCatchReturn2 {
	int calc() {
		try {
			return 1;
		}catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("End of the Method");
		return 10;
	}
	public static void main(String[] args) {
		TryCatchReturn2 obj = new TryCatchReturn2();
		System.out.println(obj.calc());
	}
}
