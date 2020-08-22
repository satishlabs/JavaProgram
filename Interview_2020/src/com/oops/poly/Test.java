package com.oops.poly;

public class Test {
	public static void main(String[] args) {
		System.out.println("Hi Geek from main");
		Test.main("Satish");
	}

	public static void main(String string) {
		System.out.println("Hi: "+string);
		Test.main("Satish","Prasad");
		
	}

	private static void main(String string, String string2) {
	System.out.println("Hi :"+string+" Hello: "+string2);
		
	}
}
