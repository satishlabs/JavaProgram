package com.thread.multithread;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class LoopTask5 implements Runnable{
	private String taskName;
	
	public LoopTask5(String taskName) {
		this.taskName= taskName;
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

public class SingleThreadedTPMain {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		for(int i=0;i<5;i++) {
			System.out.println("Submitting task "+i+" "+new Date());
			LoopTask5 task = new LoopTask5("Task "+i);
			executorService.submit(task);
		}
		try {
			Thread.sleep(2000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		executorService.shutdown();
	}
}
