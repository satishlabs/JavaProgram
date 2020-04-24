package com.program.aggreation;

import java.util.ArrayList;
import java.util.List;

public class SDI {
	public static void main(String[] args) {
		Student s1 = new Student("kapil", 11, "CSE");
		Student s2 = new Student("MS", 007, "CSE");
		Student s3 = new Student("Kohli", 11, "MCA");
		Student s4 = new Student("KL Rahul", 111, "MCA");
		
		List<Student> cse_students = new ArrayList<Student>();
		cse_students.add(s1);
		cse_students.add(s2);
		
		List<Student> mca_students = new ArrayList<Student>();
		mca_students.add(s3);
		mca_students.add(s4);
		
		Department dept1 = new Department("CSE", cse_students);
		Department dept2 = new Department("MCA", mca_students);
		
		List<Department> dept = new ArrayList<Department>();
		dept.add(dept1);
		dept.add(dept2);
		
		Institute institute = new Institute("BITS", dept);
		System.out.println("Total students in institue");
		System.out.println(institute.getTotalStudentsInInstitute());
		
	}
}
