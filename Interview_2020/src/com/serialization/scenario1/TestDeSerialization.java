package com.serialization.scenario1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestDeSerialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		B obj1 = new B();
		try {
			FileInputStream fis = new FileInputStream("E:/File/TestWS.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			obj1 = (B) ois.readObject();
			ois.close();
			System.out.println("DeSerialization Done!!");
			System.out.println("And the: ");
			 System.out.println("value of i is : " +obj1.i + " & value of j is :  " + obj1.j);
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}
