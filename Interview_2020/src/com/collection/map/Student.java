package com.collection.map;

public class Student {
	 // id will act as Key 
    private Integer id; 
  
    // name will act as value 
    private String name;

	public Student(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	
	

	@Override
	public int hashCode() {
		return 1;
	}



	@Override
	public boolean equals(Object obj) {
		return false;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	} 
  
    
}
