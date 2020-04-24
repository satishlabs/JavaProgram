package com.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorDemo {
	private static ExecutorService executor = null;
	private static volatile Future taskOneResults = null;
	private static volatile Future taskTwoResults = null;
	
	public static void main(String[] args) {
		executor = Executors.newFixedThreadPool(2);
		while(true){
			try{
				checkStatus();
				Thread.sleep(1000);
			}catch (Exception e) {
				System.out.println("Caught exeception: "+e.getMessage());
			}
		}
	}

	public static void checkStatus() {
		if(taskOneResults == null || taskOneResults.isDone() || taskOneResults.isCancelled()){
			taskOneResults = executor.submit(new TestOne());
		}
		
		if(taskTwoResults == null || taskTwoResults.isDone() || taskTwoResults.isCancelled()){
			taskTwoResults = executor.submit(new TestTwo());
		}
		
	}
}

class TestOne implements Runnable{

	@Override
	public void run() {
		while(true){
			System.out.println("Executing task one");
			try{
				Thread.sleep(1000);
			}catch (Throwable e) {
				e.printStackTrace();
			}
		}
	}
	
}

class TestTwo implements Runnable{

	@Override
	public void run() {
		while(true){
			System.out.println("Executing task two");
			try{
				Thread.sleep(1000);
			}catch (Throwable e) {
				e.printStackTrace();
			}
		}
	}
	
}