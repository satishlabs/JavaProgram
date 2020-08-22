package com.string;

public class Employee implements Comparable<Employee>{
	private int id;
    private String name;
    private Integer salary;
     
    public Employee(int id, String name, Integer sal){
        this.id = id;
        this.name = name;
        this.salary = sal;
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


	public Integer getSalary() {
		return salary;
	}


	public void setSalary(Integer salary) {
		this.salary = salary;
	}


	@Override
	public int compareTo(Employee o) {
		return this.salary.compareTo(o.getSalary());
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
