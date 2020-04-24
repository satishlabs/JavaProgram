package com.thread.reentrant;

public class Reentrant {
	public synchronized void m() {
		n();
		System.out.println("this i m() method");
	}

	public synchronized void n() {
		System.out.println("this is n() method");
	}
}
