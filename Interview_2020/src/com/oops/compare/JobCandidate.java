package com.oops.compare;

public class JobCandidate implements Comparable<JobCandidate>{
	private String name;     
	private String gender;     
	private int age;
	
	public JobCandidate(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public int getAge() {
		return age;
	}

	@Override
	public int compareTo(JobCandidate obj) {
		return (this.getAge() < obj.getAge() ?  -1 : (this.getAge() == obj.getAge() ? 0: 1));
	}

	@Override
	public String toString() {
		return "JobCandidate [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
}
