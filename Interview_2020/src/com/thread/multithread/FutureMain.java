package com.thread.multithread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

class AddTask implements Callable{
	private int x;
	private int y;
	
	public AddTask(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public Object call() throws Exception {
		Thread.sleep(4000);
		return x+y;
	}
	
}

public class FutureMain {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newScheduledThreadPool(10);
		
		AddTask task1 = new AddTask(10, 20);
		AddTask task2 = new AddTask(30, 40);
		AddTask task3 = new AddTask(50, 60);
		
		FutureTask<Integer> futureTask1 = new FutureTask<>(task1);
		FutureTask<Integer> futureTask2 = new FutureTask<>(task2);
		FutureTask<Integer> futureTask3 = new FutureTask<>(task3);
		
		executorService.submit(futureTask1);
		executorService.submit(futureTask2);
		executorService.submit(futureTask3);
		
		try {
			System.out.println("FutureTask1 output= "+futureTask1.get());
			System.out.println("FutureTask2 output= "+futureTask2.get());
			System.out.println("FutureTask3 output= "+futureTask3.get());
			
			executorService.shutdown();
		}catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}
}
