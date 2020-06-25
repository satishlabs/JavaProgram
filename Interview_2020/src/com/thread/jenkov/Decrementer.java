package com.thread.jenkov;

import java.util.concurrent.CountDownLatch;

public class Decrementer implements Runnable{
	CountDownLatch latch = null;
	
	public Decrementer(CountDownLatch latch) {
		this.latch = latch;
	}
	
	@Override
	public void run() {
		try {
			
		}
		
	}

}
