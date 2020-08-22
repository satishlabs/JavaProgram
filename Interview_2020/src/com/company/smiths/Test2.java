package com.company.smiths;

public class Test2 {
	public synchronized void methodA(int i, String msg) {
		log.writeln(Integer.toString(i));
		log.writeln(msg);
	}
	
	public void methodB(int i, String msg) {
		synchronized(this) {
			log.writeln(Integer.toString(i));
			log.writeln(msg);
		}
	}
}
