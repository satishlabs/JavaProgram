package com.thread.printerscannerissue;

public class ScanAndPrint implements Runnable{
	Printer printer;
	Scanner scanner;

	public ScanAndPrint(Printer printer, Scanner scanner) {
		this.printer = printer;
		this.scanner = scanner;
	}



	@Override
	public void run() {
		synchronized (scanner) {
			System.out.println("Thread "+Thread.currentThread().getName()+" acquried scanner");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.err.println("Thread "+Thread.currentThread().getName()+" is waiting for printer");
			synchronized (printer) {
				System.out.println("Thread "+Thread.currentThread().getName()+" is printing");
			}
		}
		
	}
}
