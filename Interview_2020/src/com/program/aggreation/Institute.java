package com.program.aggreation;

import java.util.List;

/* Institute class contains list of Department 
Objects. It is asoociated with Department 
class through its Object(s).*/


public class Institute {
	String institueName;
	private List<Department> departments;
	
	public Institute(String institueName, List<Department> departments) {
		this.institueName = institueName;
		this.departments = departments;
	}
	
	// count total students of all departments 
    // in a given institute 
	public int getTotalStudentsInInstitute() {
		int noOfStudents =0;
		List<Student> students;
		for(Department dept: departments) {
			students = dept.getStudents();
			for(Student stud : students) {
				noOfStudents++;
			}
		}
		
		return noOfStudents;
		
	}
}
