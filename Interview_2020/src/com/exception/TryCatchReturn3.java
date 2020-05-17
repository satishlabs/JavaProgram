package com.exception;


/*
 
If we return a value in catch block and if we do not return a value at the end of the method it leads to compile time exception 
Error: This method must return a result of type int

 */
public class TryCatchReturn3 {
	int calc() { //// Error:This method must return a result of type int
		try {
			
		}catch (Exception e) {
			return 1;
		}
		System.out.println("End of the method");
		//return 0
	}
	public static void main(String[] args) {
		TryCatchReturn3 obj = new TryCatchReturn3();
	}
}
