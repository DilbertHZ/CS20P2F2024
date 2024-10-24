/* Program: PrimeNumberPartB.java          Last Date of this Revision: October 24, 2024

Purpose: An application that checks and displays if a number is prime or not.

Author: Hunter Zahn, 
School: CHHS
Course: Computer Programming 20
*/

package Mastery;

import java.util.Scanner;

public class PrimeNumbersPartB {

	public static boolean isPrime(double number, double count) {

		//Method returns true if the number has no remainder when divided
		return number % count == 0;
			
	}
	
	public static void main(String[] args) {
		
		//Preparing for user input
		Scanner userInput = new Scanner(System.in);

		//Prompt and record the user for
		System.out.print("Enter an integer value: ");
		double number = userInput.nextInt();

		//Declaration
		double count= 2;
		
		//Increments the divisor by one, while 2 less than the inputed number and if the modulo != 0.
		while(count <= (number - 2) && isPrime(number, count) != true) {
			count++;
		}
		
		//Checks if the method returns true, and prints appropriate response
		if (isPrime(number, count)) {
			System.out.print("Isn't prime");
		} else {
			System.out.print("Is prime");
		}
	
	}
	
}
