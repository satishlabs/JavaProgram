package com.thread;

/*
When we cannot take a lock on null reference, what will happen if we make a
 reference null after acquiring a lock on object it is referering to? What is 
 the output of the Program? 

*/
public class SynchronizationExample1 {
	private static SynchronizationExample synchronizationExample = new SynchronizationExample();
	public static void main(String[] args) {
		hello();
	}
	private static void hello() {
		synchronized (synchronizationExample) {
			System.out.println("Before making reference null");
			synchronizationExample = null;
			System.out.println("After making reference null");
		}
	}
}
