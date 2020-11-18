package com.thread.scheduler;

import java.util.Timer;

public class SchedulerMain {
	public static void main(String[] args) throws InterruptedException {
		Timer time = new Timer();
		ScheduledTask st = new ScheduledTask();
		time.schedule(st, 0, 1000); 
		System.out.println(time);
		
		
		//for demo only.
        for (int i = 0; i <= 5; i++) {
            System.out.println("Execution in Main Thread...." + i);
            Thread.sleep(2000);
            if (i == 5) {
                System.out.println("Application Terminates");
                System.exit(0);
            }
        }
	}
}
