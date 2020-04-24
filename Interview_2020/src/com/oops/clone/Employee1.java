package com.oops.clone;

public class Employee1 implements Cloneable{
	private int employeeId;
	private String employeeName;
	private Department1 department;

	public Employee1(int employeeId, String employeeName, Department1 department) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.department = department;
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
	    Employee1 cloned = (Employee1)super.clone();
	    cloned.setDepartment((Department1)cloned.getDepartment().clone());   
	    return cloned;
	}


	/*
	 * protected Object clone() throws CloneNotSupportedException { return
	 * super.clone(); }
	 */

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

	public Department1 getDepartment() {
		return department;
	}

	public void setDepartment(Department1 department) {
		this.department = department;
	}


}
