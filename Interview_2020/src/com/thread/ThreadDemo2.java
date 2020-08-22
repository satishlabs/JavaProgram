package com.thread;

class ThreadTask implements Runnable{

	@Override
	public void run() {
		System.out.println("Inside Thread Task start");
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				Thread childThread = Thread.currentThread();
				while(true) {
					System.out.println("Insdie chhild thread: "+childThread.getName());
					try {
						Thread.sleep(1000);
					}catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
		}).start();
		System.out.println("Inside Thread Task end");
	}
	
}

public class ThreadDemo2 {
	public static void main(String[] args) {
		System.out.println("Inside Main Thread");
		Thread thread = new Thread(new ThreadTask());
		
		thread.setDaemon(true);
		thread.start();
		
		try {
			Thread.sleep(5000);
			
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("End of Main Thread");
	}
}
