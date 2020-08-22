package com.thread.multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class LoopTask1 implements Runnable{
	private String taskName;
	
	 public LoopTask1(String taskName) {
		this.taskName = taskName;
	}
	
	@Override
	public void run() {
		System.out.println("Starting: "+taskName);
		for(int i=1;i<=10;i++) {
			System.out.println("Executing: "+taskName+" With "+Thread.currentThread().getName());
		}
		System.out.println("Ending: "+taskName);
	}
	
}
public class CachedThreadPoolMain {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();
		
		for(int i=0;i<100;i++) {
			LoopTask1 task = new LoopTask1("task "+i);
			executorService.submit(task);
		}
		executorService.shutdown();
	}
}
