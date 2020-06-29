package com.thread.forkjoin;

import java.util.concurrent.RecursiveTask;

public class MyRecursiveTask extends RecursiveTask{
	int start;
	int end;
	
	long[] numberAr;
	
	public MyRecursiveTask(int start, int end, long[] numberAr) {
		this.start = start;
		this.end = end;
		this.numberAr = numberAr;
	}

	@Override
	protected Object compute() {
		int minimumProcessingSize = 100;
		long sum=0;
		
		if(end-start < minimumProcessingSize) {
			for(int i = start; i < end; i++) {
				sum += numberAr[i];
			}
		}else {
			int mid = (start+end)/2;
			MyRecursiveTask task1 = new MyRecursiveTask(start, mid, numberAr);
			MyRecursiveTask task2 = new MyRecursiveTask(mid, end, numberAr);
			
			task1.fork();
			task2.fork();
			
		   sum = task1.join() + task2.join();
		}
		return sum;
	}

}
