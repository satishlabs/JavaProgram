package com.oops;

public final class Student {
	private int sid;
	private String sname;
	private int age;
	//private Department deprt;
	
	private DummyDepartment dDeprt;
	
	public Student(int sid, String sname, int age, DummyDepartment deprt) {
		this.sid = sid;
		this.sname = sname;
		this.age = age;
		this.dDeprt = deprt;
	}

	public int getSid() {
		return sid;
	}

	public String getSname() {
		return sname;
	}

	public int getAge() {
		return age;
	}

	public DummyDepartment getDeprt() {
		return dDeprt;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", age=" + age + ", deprt=" + dDeprt + "]";
	}
	
	
}
