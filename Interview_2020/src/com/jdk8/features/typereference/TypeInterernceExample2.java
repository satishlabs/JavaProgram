package com.jdk8.features.typereference;
class GenericsClass<X>{
	X name;

	public X getName() {
		return name;
	}

	public void setName(X name) {
		this.name = name;
	}
	
	public String genericsMethod(GenericsClass<String> x) {
		x.setName("Satish");
		return x.name;
	}
	
}
public class TypeInterernceExample2 {
	public static void main(String[] args) {
		GenericsClass<String> genericClass = new GenericsClass<String>();
		genericClass.setName("Prasad");
		System.out.println(genericClass.getName());
		
		GenericsClass<String> genericClass1 = new GenericsClass<String>();
		genericClass1.setName("Peter");
		System.out.println(genericClass1.getName());
		
		//New improved type infererence 
		System.out.println(genericClass1.genericsMethod(new GenericsClass()));
	}
}
