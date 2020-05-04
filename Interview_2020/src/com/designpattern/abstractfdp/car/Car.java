package com.designpattern.abstractfdp.car;

public abstract class Car {
	private CarType model = null;	
	
	public Car(CarType model) {
		this.model  = model;
		arrangeParts();
	}
	
	 // Do subclass level processing in this method
	protected  void arrangeParts() {
		
	}

	public CarType getModel() {
		return model;
	}

	public void setModel(CarType model) {
		this.model = model;
	}
	
	
}	
