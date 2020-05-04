package com.designpattern.singleton;

public class SingletonWithClone extends SuperClass{
	public static SingletonWithClone instance = new SingletonWithClone();
	
	private SingletonWithClone() {
		
	}
	
	/*
	 * @Override protected Object clone() throws CloneNotSupportedException { return
	 * super.clone(); }
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//return super.clone(); // to prevent cloning for singleton retrunn instance here
		return instance;
	}
}
