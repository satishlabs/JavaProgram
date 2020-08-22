package com.thread.gargons;

import java.util.concurrent.Exchanger;

public class ExchangerRunnable implements Runnable{
	Exchanger exchanger = null;
	Object object = null;
	
	 public ExchangerRunnable(Exchanger exchanger, Object object) {
		this.exchanger = exchanger;
		this.object = object;
	}
	
	@Override
	public void run() {
		try {
			Object prevoius = this.object;
			
			this.object = this.exchanger.exchange(this.object);
			
			System.out.println(Thread.currentThread().getName()+" exchanged "+prevoius+" for "+this.object);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
