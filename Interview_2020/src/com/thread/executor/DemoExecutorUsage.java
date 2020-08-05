package com.thread.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DemoExecutorUsage {
	private static ExecutorService executor = null;
	private static volatile Future taskOneResults = null;
	private static volatile Future taskTwoResults = null;
	
	public static void main(String[] args) {
		executor = Executors.newFixedThreadPool(2);
		while(true) {
			try {
				checkTasks();
				Thread.sleep(1000);
			}catch (Exception e) {
				System.out.println("Caught Execption... "+e.getMessage());
			}
		}
	}

	private static void checkTasks() {
		if(taskOneResults == null || taskOneResults.isDone()
				||taskOneResults.isCancelled()) {
			taskOneResults = executor.submit(new TaskOne());
		}
		
		if(taskTwoResults == null
				|| taskTwoResults.isDone()
				|| taskTwoResults.isCancelled()) {
			taskTwoResults = executor.submit(new TaskTwo());
		}
	}
}
class TaskOne implements Runnable{

	@Override
	public void run() {
		while(true) {
			System.out.println("Executing task one...");
			try {
				Thread.sleep(1000);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
}

class TaskTwo implements Runnable{
	
	@Override
	public void run() {
		while(true) {
			System.out.println("Executing task two...");
			try {
				
				Thread.sleep(1000);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
}