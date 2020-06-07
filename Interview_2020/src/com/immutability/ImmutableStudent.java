package com.immutability;

public final class ImmutableStudent {
	private final int id;
	private final String name;
	private final Age age;
	
/*	public ImmutableStudent(int id, String name, Age age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}*/
	
	
	public ImmutableStudent(int id, String name, Age age) {
		this.id = id;
		this.name = name;
		Age clonedAge = new Age();
		clonedAge.setDay(age.getDay());
		clonedAge.setMonth(age.getMonth());
		clonedAge.setYear(age.getYear());
		this.age = clonedAge;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Age getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "ImmutableStudent [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
