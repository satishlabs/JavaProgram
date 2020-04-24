package com.thread.multithread;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class LoopTask3 implements Runnable{
	
	private String taskName;
	
	public LoopTask3(String taskName) {
		this.taskName = taskName;
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" Start Time for "+taskName);
		try {
			Thread.sleep(5000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" End Time for "+taskName);
	}
	
}

public class ScheduleAtFixedRateTPMain {
	public static void main(String[] args) {
		ScheduledExecutorService executorService = Executors.newScheduledThreadPool(3);
		for(int i=0;i<5;i++) {
			System.out.println("Submitting task "+i+" "+new Date());
			LoopTask3 task = new LoopTask3("Task "+i);
			executorService.scheduleAtFixedRate(task, 20, 10, TimeUnit.SECONDS);
		}
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
