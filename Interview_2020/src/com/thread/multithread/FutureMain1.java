package com.thread.multithread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureMain1 {
	public static void main(String[] args) {
		ExecutorService exService = Executors.newScheduledThreadPool(3);
		Future future = exService.submit(new Callable() {

			@Override
			public Object call() throws Exception {
				System.out.println("Asynchronous Callable");
				return "Callable Result";
				
			}
			
		});
		exService.shutdown();
		try {
			System.out.println("Future get= "+future.get());
		}catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}
}
