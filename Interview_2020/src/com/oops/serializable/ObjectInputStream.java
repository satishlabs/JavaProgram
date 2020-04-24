package com.oops.serializable;

import java.io.FileInputStream;
import java.io.IOException;

public class ObjectInputStream {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee emp = new Employee();
		
		//FileInputStream fis = new FileInputStream("E:/File/FileIutputStream.txt");
		FileInputStream fis = new FileInputStream("E:/File/FileOutputStream.txt");
		java.io.ObjectInputStream ois = new java.io.ObjectInputStream(fis);
		emp = (Employee) ois.readObject();
		ois.close();
		System.out.println(emp.WhoIsThis());
		System.out.println("DeSerilzation Done");
	}
}
