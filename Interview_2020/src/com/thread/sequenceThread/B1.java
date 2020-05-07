package com.thread.sequenceThread;

public class B1 extends Thread{
	NotifyAllExample notifyAllExample;
	
	public B1(NotifyAllExample  notifyAllExample) {
		this.notifyAllExample = notifyAllExample;
	}
	
	public void run() {
		try {
			synchronized (notifyAllExample) {
				for(int i=0;i<5;i++) {
					while(notifyAllExample.status != 2) {
						notifyAllExample.wait(1000);
					}
					System.out.println("B");
					notifyAllExample.status = 3;
					notifyAllExample.notifyAll();
				}
			}
		}catch (Exception e) {
			System.out.println("Exception 2: "+e.getMessage() );
		}
	}
}
