package com.thread.printerscannerissue;

public class DeadLockProgram {
	public static void main(String[] args) {
		Printer printer = new Printer();
		Scanner scanner = new Scanner();
		
		new Thread(new PrintAndScan(printer, scanner),"Satish").start();
		
		new Thread(new ScanAndPrint(printer, scanner),"Manish").start();
	}
}
