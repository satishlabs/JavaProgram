package com.thread.sequenceThread;

public class C1 extends Thread{
	NotifyAllExample  notifyAllExample;
	
	public C1(NotifyAllExample  notifyAllExample) {
		this.notifyAllExample = notifyAllExample;
	}
	
	public void run() {
		try {
			synchronized (notifyAllExample) {
				for(int i=0;i<5;i++) {
					while(notifyAllExample.status != 3) {
						notifyAllExample.wait();
					}
					System.out.println("C");
					notifyAllExample.status = 1;
					notifyAllExample.notifyAll();
				}
			}
		}catch (Exception e) {
			System.out.println("Exception 3: "+e.getMessage());
		}
	}
}
