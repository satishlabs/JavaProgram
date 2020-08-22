package com.array.smiths.studentregistration;

public class Student {
	private final String id;
    private final String name;
    
    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public String getId() {
        return this.id;
    }
    
    public String getName() {
        return this.name;
    }
}
