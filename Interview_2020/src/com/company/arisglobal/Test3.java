package com.company.arisglobal;

public class Test3 {
	public static void main(String[] args) {
		Test3 t = new Test3();
		t.check(); // exception
	}

	private void check() throws CustomException{
		System.out.println("Check");
	}
}

class CustomException extends Exception{
	CustomException(){
		super("CustomException");
	}
}