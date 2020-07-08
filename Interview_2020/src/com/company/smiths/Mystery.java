package com.company.smiths;

public class Mystery {
	private static Mystery instance = null;
	
	protectd Mystery() {
		
	}
	
	public static Mystery getInstance() {
		if(instance == null) {
			instance = new Mystery();
		}
		return instance;
	}
}
