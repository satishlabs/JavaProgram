package com.designpattern.abstractfdp.ipad;

public class IPhone  extends AppleProduct{
	public IPhone() {
		name = "IPhone";
	}
	
	public void prepare() {
		System.out.println("Creating "+name);
		System.out.println("Adding Apple Pay features");
	}
}
