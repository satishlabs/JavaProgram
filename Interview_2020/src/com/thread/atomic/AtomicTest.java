package com.thread.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTest {
	public static void main(String[] args) {
		AtomicInteger aInteger1 = new AtomicInteger();//This example creates an AtomicInteger with the initial value 0 .
		System.out.println(aInteger1);
		
		//If you want to create an AtomicInteger with an initial value, you can do so like this:
		aInteger1 = new AtomicInteger(110);
		System.out.println(aInteger1);
		
		int expectedValue = 123;
		int newValue = 124;
		
		System.out.println(aInteger1.compareAndSet(expectedValue, newValue));
		
		AtomicInteger atomicInteger = new AtomicInteger();
		System.out.println(atomicInteger.getAndAdd(10));
		System.out.println(atomicInteger.addAndGet(10));
		
	}
}
