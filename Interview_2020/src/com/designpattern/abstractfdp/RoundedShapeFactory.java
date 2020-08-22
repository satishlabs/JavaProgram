package com.designpattern.abstractfdp;

public class RoundedShapeFactory extends AbstractFactory{

	@Override
	Shape getShape(String shapeType) {
		if(shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}else if(shapeType.equalsIgnoreCase("SQUARE")) {
			return new RoundedSquare();
		}
		return null;
	}

}
