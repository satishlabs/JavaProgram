package com.oops.generic;

public class GenericMethods {
	public <T> void printData(T data) {
		System.out.println("Data is: "+data);
	}
	
	public <T> T checkData(T data){
		return data;
	}
	
	public static void main(String[] args) {
		GenericMethods obj = new GenericMethods();
		obj.checkData(1);
		obj.printData(1);
		
		//Using String as parameter
		
		obj.checkData("Satish");
		obj.printData("Satish");
	}
}
