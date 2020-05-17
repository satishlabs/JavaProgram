package com.thread.sequenceThread;

public class A1 extends Thread{
	NotifyAllExample notifyAllExample;
	
	A1(NotifyAllExample notifyAllExample){
		this.notifyAllExample = notifyAllExample;
	}
	
	public void run() {
		try {
			synchronized (notifyAllExample) {
				for(int i=0;i<5;i++) {
					while(notifyAllExample.status != 1) {
						notifyAllExample.wait();
					}
					System.out.println("A");
					notifyAllExample.status = 2;
					notifyAllExample.notifyAll();
				}
			}
		}catch (Exception e) {
			System.out.println("Exception 1: "+e.getMessage());
		}
	}
}
