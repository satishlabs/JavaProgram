package com.program.volat;

public class VolatileThread extends Thread{
		
		private final VolatileData data;
		public VolatileThread(VolatileData data) {
			this.data = data;
		}
	     public void run() {
			int oldValue = data.getCounter();
			System.out.println("[Thread "+Thread.currentThread().getId()+" ]: Old Value="+oldValue);
			data.increaseCounter();
			int newValue = data.getCounter();
			System.out.println("[Thread "+Thread.currentThread().getId()+" ]: New Value="+newValue);
		}
}
