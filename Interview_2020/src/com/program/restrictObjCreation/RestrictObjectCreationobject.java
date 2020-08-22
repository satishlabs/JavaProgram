package com.program.restrictObjCreation;

public class RestrictObjectCreationobject {
	private static RestrictObjectCreationobject object;
	public static int objectCount=0;
	
	private RestrictObjectCreationobject() {
		System.out.println("Singleton(): Private constructor invoked");
		objectCount++;
	}
	
	public static RestrictObjectCreationobject getInstance() {
		if(objectCount < 3) {
			object = new RestrictObjectCreationobject();
		}
		return object;
	}
}
