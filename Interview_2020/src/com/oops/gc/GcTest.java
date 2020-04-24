package com.oops.gc;

public class GcTest {
	public static void main(String[] args) {
		GcTest t1 = new GcTest();
		GcTest t2 = new GcTest();
		
		t1 = null;
		
		System.gc();
		
		t2=null;
		
		Runtime.getRuntime().gc();
				
	}
}
