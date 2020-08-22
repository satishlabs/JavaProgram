package com.thread.printerscannerissue;

public class PrintAndScan implements Runnable{
	Printer printer;
	Scanner scanner;

	public PrintAndScan(Printer printer, Scanner scanner) {
		this.printer = printer;
		this.scanner = scanner;
	}
	@Override
	public void run() {
		//Do printing and scanning simultaneously.
		synchronized (printer) {
			System.out.println("Thread "+Thread.currentThread().getName()+" acquured printer");
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			//Scan the documents already printed
			System.out.println("Thread "+Thread.currentThread().getName()+" is waiting for scanner");
			synchronized (scanner) {
				System.out.println("Thread "+Thread.currentThread().getName()+" is scanning");
			}
		}
		
	}

}
