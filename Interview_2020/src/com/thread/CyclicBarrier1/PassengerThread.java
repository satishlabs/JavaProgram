package com.thread.CyclicBarrier1;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class PassengerThread extends Thread{
	private int duration;
	private CyclicBarrier barrier;
	
	public PassengerThread(int duration, CyclicBarrier barrier, String pname) {
		super(pname);
		this.duration = duration;
		this.barrier = barrier;
	}
	
	public void run() {
		try {
			Thread.sleep(duration);
			System.out.println(Thread.currentThread().getName()+" is arrived");
			
			int wait = barrier.await();
			if(wait == 0) {
				System.out.println("Four passengers have arrived so cab is going to start..");
			}
		}catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
		
	}
}
