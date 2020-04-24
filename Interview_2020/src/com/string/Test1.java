package com.string;

public class Test1 {
	public void finalize() {
		System.out.println("Garbage collected");
	}
	
	public static void main(String[] args) {
		Test1 str = new Test1();
		str = null;
		
		System.gc();
	}
}
