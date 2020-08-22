package com.oops;

public class Student9 {
	int rollno;
	String name;
	static String college="RNSIT";
	
	static void change() {
		college ="VTU";
	}
	
	
	
	public Student9(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

	public void display() {
		System.out.println(rollno+" "+name+" "+college);
	}

	public static void main(String[] args) {
		Student9.change();
		Student9 s1 = new Student9(101, "Kapil");
		Student9 s2 = new Student9(102, "Ms");
		s1.display();
		s2.display();
		
	}
}
