package com.oops;

public class Department {
	int deprtId;
	String dname;
	
	public Department() {
		
	}
	public Department(int deprtId, String dname) {
		this.deprtId = deprtId;
		this.dname = dname;
	}
	public int getDeprtId() {
		return deprtId;
	}
	public void setDeprtId(int deprtId) {
		this.deprtId = deprtId;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	@Override
	public String toString() {
		return "Department [deprtId=" + deprtId + ", dname=" + dname + "]";
	}
	
	
}
