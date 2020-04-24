package com.thread.multithread;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolMain {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		Set<Callable<String>> callableSet = new HashSet<Callable<String>>();
		
		callableSet.add(new Callable<String>() {

			@Override
			public String call() throws Exception {
				System.out.println("Task1");
				return "Task1";
			}
		});
		
		callableSet.add(new Callable<String>() {

			@Override
			public String call() throws Exception {
				System.out.println("Task2");
				return "Task2";
			}
		});
		
		callableSet.add(new Callable<String>() {

			@Override
			public String call() throws Exception {
				System.out.println("Task3");
				return "Task3";
			}
		});
		
		String result = null;
		try {
			result = executorService.invokeAny(callableSet);
		}catch (InterruptedException |ExecutionException e) {
			e.printStackTrace();
		}
		
		System.out.println("Final Result => "+result);
		executorService.shutdown();
	}
}
