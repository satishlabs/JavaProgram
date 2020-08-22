package com.designpattern.abstractfdp.car;

public class SmallCar extends Car{

	public SmallCar() {
		super(CarType.SMALL);
		construct();
	}

	protected void construct() {
		System.out.println("Building small car");
		
	}

}
