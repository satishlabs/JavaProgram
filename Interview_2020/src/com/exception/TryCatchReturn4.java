package com.exception;


//return statement in catch block and end of the method but after return one statement 
public class TryCatchReturn4 {
	int calc() {
		try {
			
		}catch (Exception e) {
			return 1;
		}
		return 10;
		System.out.println("End of the methods"); //// Error : Unreachable code
		//return 11;
	}
	public static void main(String[] args) {
		TryCatchReturn4 obj = new TryCatchReturn4();
	}
}
