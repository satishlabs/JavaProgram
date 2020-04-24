package com.exception;

import java.util.Scanner;

public class CustomException {
	public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the age: ");
			int age = sc.nextInt();
			validate(age);
		}catch (Exception e) {
			System.out.println("Exception occured: "+e);
		}
		System.out.println("Rest of the code...");
	}

	public static void validate(int age) throws InvalidAgeException {
		
		if(age<18){
			throw new InvalidAgeException("Not valid");
		}else{
			System.out.println("Welcome to vote");
		}
	}
}
