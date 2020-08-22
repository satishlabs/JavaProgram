package com.jdk8.features.defaultIf;


interface Draw{
	default void show() {
		System.out.println("This is default method of Draw Interface");
	}
	
	void DrawData();

}

interface Print{
	default void show() {
		 System.out.println("This is default method of Print Interface");
	}
	void PrintData();
}

public class ManageRecord implements Draw, Print{

	@Override
	public void PrintData() {
		System.out.println("PrintData method Implemented by ManageRecord class");
	}

	@Override
	public void DrawData() {
		 System.out.println("DrawData method Implemented by ManageRecord class");
	}
	
	 @Override
	public void show() {
		Print.super.show();
		Draw.super.show();
	}
}
