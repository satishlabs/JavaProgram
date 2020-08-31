package com.thread.semaphore.scenarios1;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
	public static int sharedValue = 0;

	public static void main(String[] args) {
		Semaphore semaphore = new Semaphore(1);
		System.out.println("Semaphore with 1 permit has been created");
		System.out.println("=============================");
		IncrementThread incrementThread = new IncrementThread(semaphore);
		new Thread(incrementThread, "incrementThread").start();
		
		DecrementThread decrementThread = new DecrementThread(semaphore);
		new Thread(decrementThread, "decrementThread").start();
	}
}
