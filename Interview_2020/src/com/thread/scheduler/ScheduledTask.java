package com.thread.scheduler;

import java.util.Date;
import java.util.TimerTask;

public class ScheduledTask extends TimerTask{

	Date now;
	@Override
	public void run() {
		now = new Date();
		System.out.println("Time is: "+now);// Display current time	
	}

}
