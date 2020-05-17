package com.thread.sequenceThread;

public class Test extends Thread{
		
	public static void main(String[] args) {
		  
		  Thread thread1 = new Thread(new Runnable() {
		   public void run() {
		    System.out.println("Inside run.");
		   }
		  });
		  //thread1.run();
		  thread1.start();
		  thread1.start();
		 }
}
