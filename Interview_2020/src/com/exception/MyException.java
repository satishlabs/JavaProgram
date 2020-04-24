package com.exception;

public class MyException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MyException(String s) {
		super(s);
	}
	
	public static void main(String[] args) {
		try{
			throw new MyException("GeeksGeeks");
		}catch (Exception e) {
			System.out.println("Caught");
			
			System.out.println(e.getMessage());
		}
	}

}
