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
		//return super.clone(); // to prevent cloning for singleton retrun instance here
		return instance;
	}
	
	public static SingletonWithClone getInstance() {
		if(null == instance) {
			instance = new SingletonWithClone();
		}
		return instance;
	}
}
