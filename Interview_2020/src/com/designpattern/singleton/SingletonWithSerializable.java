package com.designpattern.singleton;

import java.io.Serializable;

public class SingletonWithSerializable implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static SingletonWithSerializable instance = new SingletonWithSerializable();
	
	private SingletonWithSerializable() {
		
	}
	
	public static SingletonWithSerializable getInstannce() {
		return instance;
	}
}
