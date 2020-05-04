package com.designpattern.abstractfdp.car;

public class LuxuryCar extends Car{

	public LuxuryCar() {
		super(CarType.LUXURY);
		Construct();
	
	}

	protected void Construct() {
		System.out.println("Building Luxury Car !");
	}

}
