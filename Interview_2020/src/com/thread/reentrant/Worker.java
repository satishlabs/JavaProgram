package com.thread.reentrant;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.locks.ReentrantLock;

public class Worker implements Runnable{
	
	String name;
	ReentrantLock re;
	
	 public Worker(ReentrantLock lc,String n) {
		 re = lc;
		 name = n;
	}
	
	@Override
	public void run() {
		 //Getting Outer Lock 
		boolean done = false;
		while(!done) {
			 // Returns True if lock is free 
			boolean ans = re.tryLock();
			if(ans) {
				try {
					Date d = new Date();
					SimpleDateFormat sd = new SimpleDateFormat("hh:mm:ss");
					System.out.println("Task name - "+name+" outer lock acquired at "+sd.format(d)+" outer lock acquired at ");
					Thread.sleep(1500);
					
					// Getting Inner Lock 
					re.lock();
					try {
						d = new Date();
						sd = new SimpleDateFormat("hh:mm:ss");
						System.out.println("Task name - "+name+" inner lock acquired at "+sd.format(d)+" Doing inner work");
						System.out.println("Lock hold Cunt - "+re.getHoldCount());
						Thread.sleep(1500);
					}catch (InterruptedException e) {
						e.printStackTrace();
					}finally {
						//Inner lock release
						System.out.println("Task name - "+name+" releasing inner lock");
						re.unlock();
					}
					System.out.println("Lock Hold count - "+re.getHoldCount());
					System.out.println("Task name - "+name+" work done");
					done = true;
				}catch (InterruptedException e) {
					e.printStackTrace();
				}finally {
					//Outer lock release
					System.out.println("Task name - "+name+" releasing outer lock");
					re.unlock();
					System.out.println("Lock Hold count -"+re.getHoldCount());
				}
			}else {
				System.out.println("Task name - "+name+" waiting for lock");
				try {
					Thread.sleep(1000);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
		
	}

}
