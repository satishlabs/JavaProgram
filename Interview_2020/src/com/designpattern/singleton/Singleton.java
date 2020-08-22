package com.designpattern.singleton;

public class Singleton {
	public static Singleton  instance = new Singleton();
	
	private Singleton() {}
	
	public static Singleton getInstannce() {
		if(null == instance) {
			instance = new Singleton();
		}
		return instance;
	}
}
