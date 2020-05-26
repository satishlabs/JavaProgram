package com.jdk8.features.date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class DateTimeDemo {
	public static void main(String[] args) {
		LocalDate d = LocalDate.now(); // only print the date 
		System.out.println(d);
		
		LocalDate d1 = LocalDate.of(1985, Month.FEBRUARY, 28);
		
		System.out.println(d1);
		
		LocalTime t = LocalTime.now();
		System.out.println(t);
		
		for(String s: ZoneId.getAvailableZoneIds()) {
			System.out.println(s);
		}
		
		LocalTime t1 = LocalTime.now(ZoneId.of("Europe/London"));
		System.out.println(t1); 
		
		LocalTime t2 = LocalTime.now(ZoneId.of("GMT"));
		System.out.println(t2);
		
		Instant ins = Instant.now();
		System.out.println(ins);//2020-05-25T11:25:55.875012300Z
		
		LocalDateTime ld = LocalDateTime.now();
		System.out.println(ld); //2020-05-25T16:55:55.892012600
		
	}
}
