package com.oops;

public class DummyDepartment extends Department{
	public DummyDepartment(int id,String dname) {
		super(id, dname);
	}
	
	public void setId(int id) {
		throw new UnsupportedOperationException();
	}
	public void setDname(String dname) {
		throw new UnsupportedOperationException();
	}
}
