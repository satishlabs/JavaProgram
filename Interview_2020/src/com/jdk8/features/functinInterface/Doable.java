package com.jdk8.features.functinInterface;
interface sayable2{
	void say(String msg);
}
//A functionl interface can extend another inteface only when it does not have any abstract method
@FunctionalInterface
public interface Doable extends sayable2{
	
	//Invalid @FunctionalInterface annotation; Doable is not a functional interface
	void doIt();
}
