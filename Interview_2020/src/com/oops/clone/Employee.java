package com.oops.clone;

public class Employee implements Cloneable{
	private int employeeId;
	private String employeeName;
	private Department department;
	
	public Employee(int employeeId, String employeeName, Department department) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.department = department;
	}

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
}
