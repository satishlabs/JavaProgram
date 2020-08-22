package com.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class StudentSerializable {
	public static void main(String[] args) {
		Student stud = new Student(1, "Satish", "satish@env.com", 7676134);
		try {
			FileOutputStream fos = new FileOutputStream("E:/File/TestWS.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(stud);
			oos.flush();
			oos.close();
			System.out.println("Serialization Done");
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}
