package com.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class StudentDeSerializable {
	public static void main(String[] args) {
		Student stud = new Student(1, "Satish", "sat@env", 7676134);
		try {
			FileInputStream fis = new FileInputStream("E:/File/TestWS.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			stud = (Student) ois.readObject();
			ois.close();
			System.out.println("DeSerialzation Done !!");
			System.out.println(stud);
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}
