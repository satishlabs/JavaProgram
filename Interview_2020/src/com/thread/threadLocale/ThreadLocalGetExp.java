package com.thread.threadLocale;

public class ThreadLocalGetExp {
	public static void main(String[] args) {
		ThreadLocal<Integer> tLocale1 = new ThreadLocal<Integer>();
		ThreadLocal<String> tLocale2 = new ThreadLocal<String>();
		
		tLocale1.set(80);
		
		System.out.println("Value: "+tLocale1.get());
		
		tLocale2.set("Satish");
		System.out.println(tLocale2.get());
		
		tLocale1.set(200);
		System.out.println("Value: "+tLocale1.get());
		
		tLocale1.remove();
		System.out.println("Value: "+tLocale1.get());
	}
}
