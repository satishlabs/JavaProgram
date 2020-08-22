package com.program.restrictObjCreation;

public class Test {
	public static void main(String[] args) {
		RestrictObjectCreationobject obj1 = RestrictObjectCreationobject.getInstance();
		RestrictObjectCreationobject obj2 = RestrictObjectCreationobject.getInstance();
		RestrictObjectCreationobject obj3 = RestrictObjectCreationobject.getInstance();
		RestrictObjectCreationobject obj4 = RestrictObjectCreationobject.getInstance();
		RestrictObjectCreationobject obj5 = RestrictObjectCreationobject.getInstance();
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		System.out.println(obj4.hashCode());
		System.out.println(obj5.hashCode());
	}
}
