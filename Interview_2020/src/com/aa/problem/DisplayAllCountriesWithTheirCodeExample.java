package com.aa.problem;

import java.util.Locale;

/*
 * Write a program to display name of all countries with their code in java.
 */
public class DisplayAllCountriesWithTheirCodeExample {
	public static void main(String[] args) {
		//Locale.getISOCountries() method will return list of all countryCode codes.
	    //Country code returned is two letter word defined in ISO 3166 standard.
		String[] countryCodeCodesArray = Locale.getISOCountries();
		
		   System.out.println("------Start displaying name of all countries with their code------");
	       int ctr = 1;
	       //Iterate over country codes array
	       for(String countryCode : countryCodeCodesArray) {
	    	   //Now, we ll get the Locale from countryCode
	    	   
	    	   Locale countryLocale = new Locale("", countryCode);
	    	   System.out.println("S.No = "+(ctr++)+" > Country is = "+countryLocale.getCountry()+" and "+countryLocale.getDisplayCountry());
	    	   
	       }
	       System.out.println("------End displaying name of all countries with their code------");
	}
}
