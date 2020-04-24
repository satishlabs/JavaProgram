package com.program;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadLocalDemo1 implements Runnable{
	//threadlocal variable createed
	private static final ThreadLocal<SimpleDateFormat> dateFormat = new ThreadLocal<SimpleDateFormat>() {
		@Override
		protected SimpleDateFormat initialValue() {
			System.out.println("Initializing simpleDateFormat for -"+Thread.currentThread().getName());
			
			return new SimpleDateFormat("dd/MM/yyyy");
			
		}
	};
	
	public static void main(String[] args) {
		ThreadLocalDemo1 td = new ThreadLocalDemo1();
		
		Thread t1 = new Thread(td, "Thread-1");
		Thread t2 = new Thread(td, "Thread-2");
		t1.start();
		t2.start();
	}

	@Override
	public void run() {
		System.out.println("Thread run execution started for "+Thread.currentThread().getName());
		System.out.println("Date formatter pattern is "+dateFormat.get().toPattern());
		System.out.println("Formatted date is "+dateFormat.get().format(new Date()));
	}

}
