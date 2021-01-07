package com.collec;

import java.util.Objects;

public class Employee {
	private int id;
	private String name;
	private String age;
	
	public Employee() {
		
	}

	public Employee(int id, String name,String age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	/*
	 * @Override public int hashCode() { final int prime = 32; int result = 1;
	 * result = prime * result + ((age == null) ? 0 : age.hashCode()); result =
	 * prime * result + id; result = prime * result + ((name == null) ? 0 :
	 * name.hashCode()); return result; }
	 */
	
	@Override
	public int hashCode() {
		
		return id + name.hashCode()+ age.hashCode();
	}
	
	/*
	 * @Override public boolean equals(Object obj) { if (this == obj) return true;
	 * if (obj == null) return false; if (getClass() != obj.getClass()) return
	 * false; Employee other = (Employee) obj; if (age == null) { if (other.age !=
	 * null) return false; } else if (!age.equals(other.age)) return false; if (id
	 * != other.id) return false; if (name == null) { if (other.name != null) return
	 * false; } else if (!name.equals(other.name)) return false; return true; }
	 */
	@Override
	public boolean equals(Object obj) {

	    // same instance
	    if (obj == this) {
	        return true;
	    }
	    // null
	    if (obj == null) {
	        return false;
	    }
	    // type
	    if (!getClass().equals(obj.getClass())) {
	        return false;
	    }
	    // cast and compare state
	    Employee other = (Employee) obj;
	    return Objects.equals(id, other.id)&& Objects.equals(name, other.name) && Objects.equals(age, other.age);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	
	
	
}
