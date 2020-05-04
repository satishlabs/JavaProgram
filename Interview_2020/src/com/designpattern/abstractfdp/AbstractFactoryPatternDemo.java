package com.designpattern.abstractfdp;

public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {
		AbstractFactory shFactory = FactoryProducer.getFactory(false);
		
		Shape shape1 = shFactory.getShape("RECTANGLE");
		shape1.draw();
		
		Shape shape2 = shFactory.getShape("SQUARE");
		shape2.draw();
		
		AbstractFactory shFactory2 = FactoryProducer.getFactory(true);
		
		Shape shape3 = shFactory2.getShape("RECTANGLE");
		shape3.draw();
		
		Shape shape4 = shFactory2.getShape("SQUARE");
		shape4.draw();
	}
}
