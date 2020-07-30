package com.exception;

//return statement in try block only

/*
 If we return a value in try block and if we do not return a value at the end of the method it leads to compile time exception 
Error: This method must return a result of type int

 */
public class TryCatchReturn {
	int calc() {
		try {
			return 1;
		}catch (Exception e) {
			// TODO: handle exception
		}
		//return 0;
	}
	
	public static void main(String[] args) {
		TryCatchReturn obj = new TryCatchReturn();
		System.out.println(obj.calc());
	}
}
