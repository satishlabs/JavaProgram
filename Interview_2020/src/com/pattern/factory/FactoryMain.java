package com.pattern.factory;

public class FactoryMain {
	public static void main(String[] args) {
		OperatiingSystemFactory osf = new OperatiingSystemFactory();
		OS obj = osf.getInstance("");
		obj.spec();
	}
}
