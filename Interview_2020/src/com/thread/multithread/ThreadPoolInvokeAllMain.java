package com.thread.multithread;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolInvokeAllMain {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
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
		callableSet.add(new Callable<String>() {

			@Override
			public String call() throws Exception {
				System.out.println("Task4");
				return "Task4";
			}
		});
		
		List<Future<String>> futureList = executorService.invokeAll(callableSet);
		
		for(Future<String> future : futureList) {
			System.out.println("Future Get Result :=> "+future.get());
		}
		
		executorService.shutdown();
	}
}
