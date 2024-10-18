/* Program: PrimeNumberPartA.java          Last Date of this Revision: October 7, 2024

Purpose: An application that checks and displays if a number is prime or not.

Author: Hunter Zahn, 
School: CHHS
Course: Computer Programming 20
*/

package Mastery;

import java.util.Scanner;

public class MetricConversion {

	static void inToCm() {
		Scanner userInput = new Scanner(System.in);
		
		double centimeters;
		
		//Prompt and record user input
		System.out.print("Enter number of inches: ");
		double inches = userInput.nextDouble();
		centimeters = inches * 2.54;
		
		System.out.print(inches + " inches equals " + centimeters + " centimeters.");
	}
	
	static void cmToIn() {
		Scanner userInput = new Scanner(System.in);
		
		double inches;
		
		//Prompt and record user input
		System.out.print("Enter number of centimeters: ");
		double centimeters = userInput.nextDouble();
		
		inches = centimeters / 2.54;
		
		System.out.print(centimeters + " centimeters equals " + inches + " inches.");
	}
	
	static void ftToCm() {
		Scanner userInput = new Scanner(System.in);
		
		double centimeters;
		
		//Prompt and record user input
		System.out.print("Enter number of feet: ");
		double feet = userInput.nextDouble();
		
		centimeters = feet * 30;
		
		System.out.print(feet + " feet equals " + centimeters + " centimeters.");
	}
	
	static void cmToFt() {
		Scanner userInput = new Scanner(System.in);
		
		double feet;
		
		//Prompt and record user input
		System.out.print("Enter number of centimeters: ");
		double centimeters = userInput.nextDouble();
		
		feet = centimeters / 30;
		
		System.out.print(centimeters + " centimeters equals " + feet + " feet.");
	}
	
	static void ydToM() {
		Scanner userInput = new Scanner(System.in);
		
		double meters;
		
		//Prompt and record user input
		System.out.print("Enter number of yards: ");
		double yards = userInput.nextDouble();
		
		meters = yards * 0.91;
		
		System.out.print(yards + " yards equals " + meters + " meters.");
	}
	
	static void mToYd() {
		Scanner userInput = new Scanner(System.in);
		
		double yards;
		
		//Prompt and record user input
		System.out.print("Enter number of meters: ");
		double meters = userInput.nextDouble();
		
		yards = meters / 0.91;
		
		System.out.print(meters + " meters equals " + yards + " yards.");
	}
	
	static void miToKm() {
		Scanner userInput = new Scanner(System.in);
		
		double kilometers;
		
		//Prompt and record user input
		System.out.print("Enter number of miles: ");
		double miles = userInput.nextDouble();
		
		kilometers = miles * 1.6;
		
		System.out.print(miles + " miles equals " + kilometers + " kilometers.");
	}
	
	static void kmToMi() {

		
		double miles;
		Scanner userInput = new Scanner(System.in);
		
		//Prompt and record user input
		System.out.print("Enter number of kilometers: ");
		double kilometers = userInput.nextDouble();
		
		miles = kilometers / 1.6;
		
		System.out.print(kilometers + " kilometers equals " + miles + " miles.");
	}
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("1. Inches > Centimeters");
		System.out.println("2. Centimeters > Inches");
		System.out.println("3. Feet > Centimeters");
		System.out.println("4. Centimeters > Feet");
		System.out.println("5. Yards > Meters");
		System.out.println("6. Meters > Yards");
		System.out.println("7. Miles > Kilometers");
		System.out.println("8. Kilometers > Miles");
		
		System.out.print("Enter a operator: ");
		int operator = userInput.nextInt();
		
		switch(operator) {
		case 1:
			inToCm();
			break;
		case 2:
			cmToIn();
			break;
		case 3:
			ftToCm();
			break;
		case 4:
			cmToFt();
			break;
		case 5:
			ydToM();
			break;
		case 6:
			mToYd();
			break;
		case 7:
			miToKm();
			break;
		case 8:
			kmToMi();
			break;
		}
		
	}

}
