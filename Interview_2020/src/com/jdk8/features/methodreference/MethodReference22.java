package com.jdk8.features.methodreference;

public class MethodReference22 {
	public static void ThreadStatus() {
		System.out.println("Thread is running...");
	}
	public static void main(String[] args) {
		Thread t1 = new Thread(MethodReference22::ThreadStatus);
		t1.start();
	}
}
