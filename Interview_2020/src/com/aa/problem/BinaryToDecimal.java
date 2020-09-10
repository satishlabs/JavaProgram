package com.aa.problem;

public class BinaryToDecimal {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		    int binaryNumber = 0;
		    int counter = 0;
		    int number = 0;


		    System.out.print("Input binary number: ");
		    binaryNumber = input.nextInt();

		    //it's going to stop when the binaryNumber/10 is less than 0
		    //example:
		    //binaryNumber = 11/10. The result value is 1 when you do the next
		    //operation 1/10 . The result value is 0     

		    while(binaryNumber != 0)
		    {
		        //Obtaining the remainder of the division and multiplying it 
		        //with the number raised to two

		        //adding it up with the previous result

		        number += ((binaryNumber % 10)) * Math.pow(2,counter);

		        binaryNumber /= 10;  //removing one digit from the binary number

		        //Increasing counter 2^0, 2^1, 2^2, 2^3.....
		        counter++;

		    }
		    System.out.println("Decimal number : " + number);


		
	}
}
