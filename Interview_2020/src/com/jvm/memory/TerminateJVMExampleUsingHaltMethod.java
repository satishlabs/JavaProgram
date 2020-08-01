package com.jvm.memory;

public class TerminateJVMExampleUsingHaltMethod {
	public static void main(String[] args) {
		 System.out.println("Halt method program - to terminate JVM (Java virtual machine)");
         
	      /**
	      * first we will get the java Runtime object using the
	      * Runtime class's getRuntime() method in java.
	      */
		 Runtime runtime = Runtime.getRuntime();
		 
		 /**
	      * halt method of Runtime class
	      * terminates the running JVM (Java virtual machine) forcibly.
	      * halt method never returns normally.
	      *
	      * Two important points about halt method in java >
	      *  1) halt method does not allows even already
	       *  registered ShutdownHook to be executed (shown in program 2 below) And
	      *  2) halt method even does not run the un invoked finalizers
	      *  if finalization-on-exit has been enabled.
	      */
		 
		 runtime.halt(1); //pass status as 1
		 
		 System.out.println("JVM (Java virtual machine) halted"); //This line won't be printed
	}
}
