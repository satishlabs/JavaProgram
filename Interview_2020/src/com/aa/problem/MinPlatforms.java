package com.aa.problem;

import java.util.Arrays;

public class MinPlatforms {
	// Find minimum number of platforms needed in the station to avoid any
		// delay in arrival of any train
	public static void main(String[] args) {
		double[] arrival = { 2.00, 2.10, 3.00, 3.20, 3.50, 5.00 };
		double[] departure = { 2.30, 3.40, 3.20, 4.30, 4.00, 5.20 };

		// sort arrival time of trains
		Arrays.sort(arrival);

		// sort departure time of trains
		Arrays.sort(departure);

		System.out.print("Minimum platforms needed is "
					+ minPlatforms(arrival, departure));
	}

	private static int minPlatforms(double[] arrival, double[] departure) {
		int count=0; //maintain the count of trains
		
		//stores minimum platforms needed
		int platforms = 0;
		
		//take two variable for arrival and departure time
		int i=0;
		int j=0;
		
		//run till train is scheduled to arive
		while(i < arrival.length) {
			//if train is scheduled to arrive next
			if(arrival[i] < departure[j])
			{
				//increase the count of trains and update minimum
				//platforms if required 
				platforms = Integer.max(platforms, ++count);
				
				//move to the pointer next arrival
				i++;
			}

			// if train is scheduled to depart next i.e.
			// (departure[j] < arrival[i]), decrease the count of trains
			// and move pointer j to next departure
			// If two trains are arriving and departing at the same time,
			// i.e. (arrival[i] == departure[j]) depart the train first
			else {
				count--;
				j++;
			}
		}
		
		return platforms;	
	}
}
