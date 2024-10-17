/* Program: PrimeNumberPartA.java          Last Date of this Revision: October 7, 2024

Purpose: An application that checks and displays if a number is prime or not.

Author: Hunter Zahn, 
School: CHHS
Course: Computer Programming 20
*/

package Mastery;

import java.util.Scanner;

public class MetricConversion {

	static double inToCm() {

		
		double centimeters;
		
		centimeters = number * 2.54;
		
		System.out.print(number + " inches equals " + centimeters + " centimeters.");
	}
	
	static void cmToIn() {

		
		double inches;
		
		double centimeters = userInput.nextDouble();
		
		inches = centimeters / 2.54;
		
		System.out.print(centimeters + " centimeters equals " + inches + " inches.");
	}
	
	static void ftToCm() {

		
		double centimeters;
		
		double feet = userInput.nextDouble();
		
		centimeters = feet * 30;
		
		System.out.print(feet + " feet equals " + centimeters + " centimeters.");
	}
	
	static void cmToFt() {

		
		double feet;
		
		double centimeters = userInput.nextDouble();
		
		feet = centimeters / 30;
		
		System.out.print(centimeters + " centimeters equals " + feet + " feet.");
	}
	
	static void ydToM() {
	
		
		double meters;
		
		double yards = userInput.nextDouble();
		
		meters = yards * 0.91;
		
		System.out.print(yards + " yards equals " + meters + " meters.");
	}
	
	static void mToYd() {

		
		double yards;
		
		double meters = userInput.nextDouble();
		
		yards = meters / 0.91;
		
		System.out.print(meters + " meters equals " + yards + " yards.");
	}
	
	static void miToKm() {
	
		
		double kilometers;
		
		double miles = userInput.nextDouble();
		
		kilometers = miles * 1.6;
		
		System.out.print(miles + " miles equals " + kilometers + " kilometers.");
	}
	
	static void kmToMi() {

		
		double miles;
		
		double kilometers = userInput.nextDouble();
		
		miles = kilometers / 1.6;
		
		System.out.print(kilometers + " kilometers equals " + miles + " miles.");
	}
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = userInput.nextInt();
		
		System.out.print("Enter a operator: ");
		int operator = userInput.nextInt();
		
	}

}
