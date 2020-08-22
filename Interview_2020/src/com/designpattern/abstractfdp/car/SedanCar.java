package com.designpattern.abstractfdp.car;

public class SedanCar extends Car{

	public SedanCar() {
		super(CarType.SEDAN);
		construct();
		
	}

	protected void construct() {
		System.out.println("Building Sedan car!");
		
	}

}
