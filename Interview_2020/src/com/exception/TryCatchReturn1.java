package com.exception;
//return statement in try block and end of the method but after return one statement 
public class TryCatchReturn1 {
	int calc() {
		try {
			return 1;
		}catch (Exception e) {
			// TODO: handle exception
		}
		return 10;
		System.out.println("End of the method"); //// Error : Unreachable code
		
	}
	
	public static void main(String[] args) {
		TryCatchReturn1 obj = new TryCatchReturn1(); 
		System.out.println(obj.calc());
	}
}
