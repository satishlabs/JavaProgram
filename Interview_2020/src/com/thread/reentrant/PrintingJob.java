package com.thread.reentrant;

public class PrintingJob implements Runnable{
	private PrinterQueue printerQueue;
	
	public PrintingJob(PrinterQueue printerQueue) {
		this.printerQueue = printerQueue;
	}

	@Override
	public void run() {
		System.out.println("%s: Going to print a document\n"+Thread.currentThread().getName());
		printerQueue.printJob(new Object());
		
	}
}
