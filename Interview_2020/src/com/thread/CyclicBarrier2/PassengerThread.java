package com.thread.CyclicBarrier2;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class PassengerThread extends Thread{
	private int duration;
	private CyclicBarrier barrier;
	
	public PassengerThread(int duration, CyclicBarrier barrier,String name) {
		super(name);
		this.duration = duration;
		this.barrier = barrier;
	}
	
	public void run() {
		try {
			Thread.sleep(duration);
			System.out.println(Thread.currentThread().getName()+" is arrived");
			
			int await = barrier.await();
			if(await == 0) {
				System.out.println("Two passenger have arrived, so cab is going to start.");
				System.out.println("======================================================");
			}
		}catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
	}
}
