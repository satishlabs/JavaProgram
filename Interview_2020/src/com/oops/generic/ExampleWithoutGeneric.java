package com.oops.generic;

public class ExampleWithoutGeneric {
	public static void main(String[] args) {
		ExampleWithoutGeneric obj = new ExampleWithoutGeneric();
		  // Showing data of integer
		obj.showInData(5,10);
		
		 // Showing data of String
		obj.showInData("Satish", "Prasad");
		
		// Showing data of float
		obj.showInData(2.0, 3.6);
	}

	private void showInData(double d, double e) {
		System.out.println("Show Data in float");
		System.out.println(d+" , "+e);
	}

	public void showInData(String string1, String string2) {
		System.out.println("String data:");
		System.out.println("String1: "+string1+" String2: "+string2);
		
	}

	public void showInData(int i, int j) {
		System.out.println("Show Integer Data");
		System.out.println("i: "+i+" j: "+j);
		
	}
}
