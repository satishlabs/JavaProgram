package com.serialization.scenario2;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestSerialization {
	public static void main(String[] args) {
		B obj = new B(10,20);
		try {
			FileOutputStream fos = new FileOutputStream("E:/File/TestWS.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
			oos.flush();
			oos.close();
			System.out.println("Serialization Done !!");
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}
