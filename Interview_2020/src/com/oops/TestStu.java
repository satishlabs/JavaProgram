package com.oops;

public class TestStu {
	public static void main(String[] args) {
		Student stud = new Student(1, "Satish", 30, new DummyDepartment(11, "His"));
		Department d = stud.getDeprt();
		System.out.println(d);
		d.setDeprtId(21);
		d.setDname("Maths");
		
		
		System.out.println();
	}
}
