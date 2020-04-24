package com.program;

public class TestEx {
	public static void main(String[] args) {
		 System.out.println(TestEx.myMethod());
	}

	public static int myMethod() {
		try{
			int a = 2/0;
			System.out.println(a);
			
		}catch (Exception e) {
			System.out.println("test");
			System.out.println(e);
			return 1;
		}finally {
			System.out.println("@");
			return 2;
		}
		//return 0;
	}

	
}
