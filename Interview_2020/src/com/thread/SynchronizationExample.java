package com.thread;

public class SynchronizationExample {
	//Lock cannot be acquired on null reference.
	private static SynchronizationExample synchronizationExample= null;
	
	public static void main(String[] args) {
		hello();
	}

	private static void hello() {
		synchronized (synchronizationExample) {
			System.out.println("Inside synchronized block");
		}
		
	}
}
/*
output:
Exception in thread "main" java.lang.NullPointerException
	at com.thread.SynchronizationExample.hello(SynchronizationExample.java:12)
	at com.thread.SynchronizationExample.main(SynchronizationExample.java:8)


*/