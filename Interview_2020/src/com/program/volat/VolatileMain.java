package com.program.volat;

public class VolatileMain {
	private final static int noOfThreads = 2; 
	public static void main(String[] args) throws InterruptedException {
		VolatileData volData = new VolatileData();
		Thread[] threads = new Thread[noOfThreads]; 
		for(int i=0;i<noOfThreads;i++) 
			threads[i] = new VolatileThread(volData);
			for(int j=0;j<noOfThreads;j++) 
				threads[j].start();
				for(int k = 0; k < noOfThreads; ++k)  
					threads[k].join(); 
			
			
			
	}
}
