package com.oops;

public class Test2 {
	int Test2(int i) {
		System.out.println("Test2");
		return i;
	}
	Test2(){
		System.out.println("Test1");
	}
	
	public static void main(String[] args) {
		Test2 test = new Test2();
		System.out.println(test.Test2(5));
	}
}
