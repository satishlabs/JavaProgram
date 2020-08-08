package com.thread.CountDownLatch1;

public class CountDownLatchCustom {
	  private int count;
	  
	    public CountDownLatchCustom(int count) {
	           this.count=count;
	    }
	 
	 
	    public synchronized void await() throws InterruptedException {
	           //If count is greater than 0, thread waits.
	           if(count>0)
	                  this.wait();
	    }
	 

	    public synchronized void countDown() {
	           //decrement the count by 1.
	           count--;
	           
	           //If count is equal to 0, notify all waiting threads.
	           if(count == 0)
	                  this.notify();
	    }
}
