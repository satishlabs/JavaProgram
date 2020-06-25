package com.thread.CyclicBarrier;

public class CountDown {
	int count;
	
	public CountDown(int count) {
		this.count = count;
	}
	
	public void increment(){
		this.count++;
	}
	
	public void decrement(String heroWhoDoTheJob) {
		System.out.println("Koan hai jo reduce kar ke gya hai " + " main hun kar le kya karen " + heroWhoDoTheJob);
		this.count--;
		System.out.println(" main kar bhi diya " + heroWhoDoTheJob);
	}
	
	public int getCount() {
		return count;
	}
}
