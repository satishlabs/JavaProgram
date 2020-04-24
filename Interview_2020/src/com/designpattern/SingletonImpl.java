package com.designpattern;

import java.io.Serializable;

public class SingletonImpl implements Cloneable, Serializable{
	private static SingletonImpl singletInstance = null;
	
	private SingletonImpl() {
		
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return singletInstance;
	}
		
	public static SingletonImpl getInstance() {
		if(null == singletInstance) {
			singletInstance = new SingletonImpl();
		}
		return singletInstance;
	}
	
	public Object readResolve() {
		return SingletonImpl.getInstance();
	}
}
