package com.designpattern.singleton;

import java.io.Serializable;

public class SingletonWithReadResolve implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static SingletonWithReadResolve instance = new SingletonWithReadResolve();
	
	private SingletonWithReadResolve() {
		
	}
	
	
	// implement readResolve method 
    protected Object readResolve() 
    { 
        return instance; 
    } 
}
