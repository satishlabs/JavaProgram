package com.designpattern.abstractfdp.car;

public abstract class Car {
	private CarType model = null;	
	
	public Car(CarType model) {
		this.model  = model;
		arrangeParts();
	}
	
	 @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (model != other.model)
			return false;
		return true;
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
