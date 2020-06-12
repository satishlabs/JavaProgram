package com.designpattern;

public class DoubleCheckedLockingSingleton {
		private static DoubleCheckedLockingSingleton instance;
		
		private DoubleCheckedLockingSingleton() {
		       // 10000 lines of initialization code
		}
		public static DoubleCheckedLockingSingleton getInstance(){
			
			if(instance == null) { // first time lock
				
				synchronized (DoubleCheckedLockingSingleton.class) {
					
					if(instance == null) {
						
						instance = new DoubleCheckedLockingSingleton();
	                    System.out.println("Instance Created");
					}
				}
			}
			return instance;
		}
}
