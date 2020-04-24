package com.thread.reentrant;

public class ReentrantExample {
	public static void main(String[] args) {
		Reentrant re = new Reentrant();
		Thread t1 = new Thread() {
			public void run() {
				re.m();
			}
		};
		t1.start();
	}
}
