package com.designpattern.singleton;

public class TestSingletonWithSerializable {
	public static void main(String[] args) throws CloneNotSupportedException {
		SingletonWithClone instance1 = SingletonWithClone.getInstance();
		SingletonWithClone instacne2  = (SingletonWithClone)instance1.clone();
		
		System.out.println("instacne1.hashcode: "+instance1.hashCode());
		System.out.println("instacne2.hashcode: "+instacne2.hashCode());
	}
}
