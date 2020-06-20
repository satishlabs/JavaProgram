package com.adt;

public class Counter {
	private String name=null;
	private int value=0;
	
	private void doSomething() {	
	}
	public Counter(String str) {
		this.name = str;
	}
	
	public void increment(){
		value++;
	}
	
	public int getCurrentValue(){
		return value;	
	}

	@Override
	public String toString() {
		return "Counter [name=" + name + ", value=" + value + "]";
	}

	
	
	
	
}
