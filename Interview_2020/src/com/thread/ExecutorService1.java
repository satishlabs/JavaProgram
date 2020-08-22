package com.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorService1 {
	public static void main(String[] args) {
		System.out.println("Insdie: "+Thread.currentThread().getName());
		System.out.println("Creating ExecutorService");
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		System.out.println("Creating runnable");
		Runnable runnable = ()->{
			System.out.println("Inside: "+Thread.currentThread().getName());
		};
		System.out.println("Submit the task specified by the runnable to the executors");
		executorService.submit(runnable);
	}
}
