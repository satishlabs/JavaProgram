package com.collection.list;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentDemo extends Thread{
	
	 static CopyOnWriteArrayList<String> clist = new CopyOnWriteArrayList<>();
	public void run() {
		clist.add("D");
	}
	
	public static void main(String[] args) throws InterruptedException {
		clist.add("A");
		clist.add("B");
		clist.add("C");
		
		ConcurrentDemo demo = new ConcurrentDemo();
		demo.run();
		
		Thread.sleep(1000);
		Iterator itr = clist.iterator();
		while(itr.hasNext()) {
			String s = (String)itr.next();
			System.out.println(s);
			Thread.sleep(1000);
		}
		System.out.println(clist);
	}
}
