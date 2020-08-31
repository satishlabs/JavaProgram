package com.comapny.paramti;

public class Test4 {
	public static void main(String[] args) {
	// 	String temp[] = {"A","B","C"};
		int c=-1;
		//int a,b;
		try {
			c = 4/0;
		}catch (Exception e) {
			System.out.println("Exception");
		}finally {
			System.out.println("Finally");
		}
	}
}
