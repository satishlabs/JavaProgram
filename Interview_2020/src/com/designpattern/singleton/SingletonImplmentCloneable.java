package com.designpattern.singleton;

public class SingletonImplmentCloneable implements Cloneable{
	private static SingletonImplmentCloneable instance ;
	
	private SingletonImplmentCloneable() {
		
	}
	
	public static SingletonImplmentCloneable getInstance() {
		if(instance == null) {
			synchronized (SingletonImplmentCloneable.class) {
				if(instance == null) {
					instance = new SingletonImplmentCloneable();
				}
			}
		}
		return instance;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// to prevent cloning for singleton retrunn instance here
		return instance;
	}
}
