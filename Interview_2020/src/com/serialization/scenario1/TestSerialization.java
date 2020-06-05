package com.serialization.scenario1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 When super class is implements Serializable interface and subclass is not.

In this case the object of subclass get serialized by default when superclass get serialize, 

even if subclass doesn't implements Serializable interface.
  */

public class TestSerialization {
	public static void main(String[] args) throws IOException {
		B obj = new B();
		try {
			FileOutputStream fos = new FileOutputStream("E:/File/TestWS.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
			
			oos.flush();
			oos.close();
			System.out.println("Serialization Done !!!");
			
		}catch (IOException e) {
			System.out.println(e);
		}
	}
}
