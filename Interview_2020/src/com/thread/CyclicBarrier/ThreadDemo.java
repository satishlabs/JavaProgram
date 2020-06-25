package com.thread.CyclicBarrier;

public class ThreadDemo extends Thread{
	CountDown countDown;
	public ThreadDemo(CountDown count) {
		this.countDown = count;
		// TODO Auto-generated constructor stub
	}
	public void run() {
		System.out.println("Thread Name: "+Thread.currentThread().getName()+" started..with count.." + countDown.getCount());
		if (countDown.getCount() > 0) {
			System.out.println("Hey guys i am " + Thread.currentThread().getName()   + " reducing the count..from " + countDown.getCount());
			countDown.decrement(Thread.currentThread().getName());
			System.out.println("Hey guys i am " + Thread.currentThread().getName()   + "  done with reducing the count..to " + countDown.getCount());
		} else{
			System.out.println("Do some processing...");
		}
		System.out.println("Thread Name: "+Thread.currentThread().getName()+" finished..");
	}
}
