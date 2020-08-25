package com.serialization;

import java.io.Serializable;

public class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	int id;
	String sname;
	private String addedField;
	transient String email; //not serialized
	transient long phone; //not serialized
	static int passMarks; //not serialized
	public Student(int id, String sname, String email, long phone) {
		this.id = id;
		this.sname = sname;
		this.email = email;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", sname=" + sname + "]";
	}
	
	
}
