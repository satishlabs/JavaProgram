package com.thread.multithread;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class LoopTask2 implements Runnable{
	private String taskName;
	
	public LoopTask2(String taskName) {
		this.taskName = taskName;
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" Start Time for: "+taskName);
		
		//Process task here
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" End Time for: "+taskName);
	}
	
}

public class ScheduleThreadPoolMain {
	public static void main(String[] args) {
		ScheduledExecutorService executorService = Executors.newScheduledThreadPool(3);
		for(int i=0;i<10;i++) {
			System.out.println("Submitting task "+i+" "+new Date());
			LoopTask2 task = new LoopTask2("Task "+i);
			executorService.schedule(task, 20, TimeUnit.SECONDS);
		}
		executorService.shutdown();
	}
}
