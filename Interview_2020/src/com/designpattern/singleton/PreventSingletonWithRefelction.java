package com.designpattern.singleton;

import java.lang.reflect.Constructor;

public class PreventSingletonWithRefelction {
	public static void main(String[] args) {
		Singleton instance1 = Singleton.instance;
		Singleton instance2 = null;
		try {
			Constructor[] constructors = Singleton.class.getDeclaredConstructors();
			for(Constructor constructor : constructors) {
				// Below code will destroy the singleton pattern 
				constructor.setAccessible(true);
				instance2 = (Singleton)constructor.newInstance();
				break;
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("instance1.hashcode: "+instance1.hashCode());
		System.out.println("instance2.hashcode: "+instance2.hashCode());
	}
}
