package com.oops.clone;

public class Student18 implements Cloneable{
	int rollno;
	String name;
	public Student18(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public static void main(String[] args) {
		try {
			Student18 s1 = new Student18(1, "Satish");
			Student18 s2 = (Student18)s1.clone();
			
			System.out.println(s1.rollno+" "+s1.name);
			
			System.out.println("After cloning....");
			System.out.println(s2.rollno+" "+s2.name);
		}catch (CloneNotSupportedException e) {
			// TODO: handle exception
		}
	}
}
