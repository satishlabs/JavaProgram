package com.program;

public class ThreadLocalExp implements Runnable{
	private ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>();
	
	public static void main(String[] args) {
		ThreadLocalExp  td= new ThreadLocalExp();
		Thread t1 = new Thread(td);
		Thread t2 = new Thread(td);
		t1.start();
		t2.start();
	}

	@Override
	public void run() {
		threadLocal.set((int) (Math.random()*50D));
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(threadLocal.get());
	}
}
