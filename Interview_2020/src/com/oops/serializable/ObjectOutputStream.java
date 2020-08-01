package com.oops.serializable;

import java.io.FileOutputStream;
import java.io.IOException;


public class ObjectOutputStream {
	public static void main(String[] args) throws IOException {
		Employee emp = new Employee();
		emp.setId(11);
		emp.setName("Satish");
		emp.setAge((byte) 33);
		emp.setAddress("Ranchi");
		

		//FileOutputStream fos = new FileOutputStream("E:/File/FileOutputStream.txt");
		FileOutputStream fos = new FileOutputStream("E:/File/FileOutputStream.txt");
		java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(fos);
		oos.writeObject(emp);
		oos.close();
		System.out.println("Serlization completed");

	}
}
