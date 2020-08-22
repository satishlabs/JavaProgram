package com.thread.sequenceThread;

public class NotifyAllExample {
	int status = 1;
	public static void main(String[] args) {
		NotifyAllExample notifyAllExample = new NotifyAllExample();
		
		A1 a = new A1(notifyAllExample);
		B1 b = new B1(notifyAllExample);
		C1 c = new C1(notifyAllExample);
		
		a.start();
		b.start();
		c.start();
	}
}
