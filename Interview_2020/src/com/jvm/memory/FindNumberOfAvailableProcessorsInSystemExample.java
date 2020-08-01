package com.jvm.memory;
//Find out total number of available processors to JVM?
public class FindNumberOfAvailableProcessorsInSystemExample {
	public static void main(String[] args) {
		 /**
	      * first we will get the java Runtime object using the
	      * Runtime class's getRuntime() method in java.
	      */
		Runtime runtime = Runtime.getRuntime();
		 /**
	      * Now,  Find out total Number Of Processors Available to
	      * JVM (Java virtual machine) In System
	      * We will use native method availableProcessors in java.
	      */
		int numberOfProcessors = runtime.availableProcessors();
		System.out.println("total Number Of Processors Available to "
	               + "JVM (Java virtual machine) In your System = "+numberOfProcessors);
	}
}
