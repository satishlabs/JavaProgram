package com.thread;

//We can also create a thread without implementing the Runnable interface in the below program

public class CreateThreadWithoutImplementRunnable {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=1;i<=5;i++) {
					System.out.println("run() method of Runnable interface: "+i);
				}
			}
		}).start();
		for(int j=1;j<=5;j++) {
			System.out.println("main() method: "+j);
		}
	}
}
