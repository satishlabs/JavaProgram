package com.oops.defineobject;

//Defining object of a class as local to a method or local variable.
public class ObjectInsideMethod {
	int val;
	
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}

	public void createObject() {
		ObjectInsideMethod obj = new ObjectInsideMethod();
		obj.setVal(10);
		
		System.out.println(obj.getVal());
	}
	
	public static void main(String[] args) {
		ObjectInsideMethod obj1 = new ObjectInsideMethod();
		obj1.createObject();
	}
}
