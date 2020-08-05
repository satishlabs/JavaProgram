package com.jvm.memory;

public class TerminateJVMUsingExitMethodAndShowShutdownHooksAreExecuted {
	public static void main(String[] args) {
		System.out.println("Exit method program - to terminate JVM (Java virtual machine)");
		Runtime runtime = Runtime.getRuntime();
		//Register/ add ShutdownHook, it will get called after
		//JVM is shutDown using exit method.
		Runtime.getRuntime().addShutdownHook(new Thread() {
			public void run() {
				try {
					System.out.println("Executing shutdown hook...");
				}catch (Exception e) {
					e.printStackTrace();
				}

				System.out.println("shutdown hook executed successfully");
			}
		});
		//call exit method
		runtime.exit(1);
		System.out.println("JVM (Java virtual machine) exited"); //This line won't be printed
	}
}
