package com.thread.multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolMain {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(3);
		for(int i=0;i<10;i++) {
			LoopTask task = new LoopTask("task "+i);
			es.submit(task);
		}
		es.shutdown();
	}
}
class LoopTask implements Runnable{
	private String taskName;
	
	public LoopTask(String taskName) {
		super();
		this.taskName= taskName;
	}
	@Override
	public void run() {
		System.out.println("Starting: "+taskName);
		for(int i=1;i<=10;i++) {
			System.out.println("Executing: "+taskName+ " wtih "+ Thread.currentThread().getName());
		}
		System.out.println("Ending: "+taskName);
	}
	
}