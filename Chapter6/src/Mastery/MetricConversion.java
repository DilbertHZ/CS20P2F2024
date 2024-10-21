/* Program: MetricConversion.java          Last Date of this Revision: October 20, 2024

Purpose: An application that converts Metric > Imperial measurements and vice-verca.

Author: Hunter Zahn, 
School: CHHS
Course: Computer Programming 20
*/

package Mastery;

import java.util.Scanner;

public class MetricConversion {

	static void inToCm() {
		//Preparing for user input
		Scanner userInput = new Scanner(System.in);
		
		//Declaration
		double centimeters;
		
		//Prompt and record user input
		System.out.print("Enter number of inches: ");
		double inches = userInput.nextDouble();
		
		//Calculate conversion
		centimeters = inches * 2.54;
		
		//Print conversion
		System.out.print(inches + " inches equals " + centimeters + " centimeters.");
	}
	
	static void cmToIn() {
		//Preparing for user input
		Scanner userInput = new Scanner(System.in);
		
		//Declaration
		double inches;
		
		//Prompt and record user input
		System.out.print("Enter number of centimeters: ");
		double centimeters = userInput.nextDouble();
		
		//Calculate conversion
		inches = centimeters / 2.54;
		
		//Print conversion
		System.out.print(centimeters + " centimeters equals " + inches + " inches.");
	}
	
	static void ftToCm() {
		//Preparing for user input
		Scanner userInput = new Scanner(System.in);
		
		//Declaration
		double centimeters;
		
		//Prompt and record user input
		System.out.print("Enter number of feet: ");
		double feet = userInput.nextDouble();
		
		//Calculate conversion
		centimeters = feet * 30;
		
		//Print conversion
		System.out.print(feet + " feet equals " + centimeters + " centimeters.");
	}
	
	static void cmToFt() {
		//Preparing for user input
		Scanner userInput = new Scanner(System.in);
		
		//Declaration
		double feet;
		
		//Prompt and record user input
		System.out.print("Enter number of centimeters: ");
		double centimeters = userInput.nextDouble();
		
		//Calculate conversion
		feet = centimeters / 30;
		
		//Print conversion
		System.out.print(centimeters + " centimeters equals " + feet + " feet.");
	}
	
	static void ydToM() {
		//Preparing for user input
		Scanner userInput = new Scanner(System.in);
		
		//Declaration
		double meters;
		
		//Prompt and record user input
		System.out.print("Enter number of yards: ");
		double yards = userInput.nextDouble();
		
		//Calculate conversion
		meters = yards * 0.91;
		
		//Print conversion
		System.out.print(yards + " yards equals " + meters + " meters.");
	}
	
	static void mToYd() {
		//Preparing for user input
		Scanner userInput = new Scanner(System.in);
		
		//Declaration
		double yards;
		
		//Prompt and record user input
		System.out.print("Enter number of meters: ");
		double meters = userInput.nextDouble();
		
		//Calculate conversion
		yards = meters / 0.91;
		
		//Print conversion
		System.out.print(meters + " meters equals " + yards + " yards.");
	}
	
	static void miToKm() {
		//Preparing for user input
		Scanner userInput = new Scanner(System.in);
		
		//Declaration
		double kilometers;
		
		//Prompt and record user input
		System.out.print("Enter number of miles: ");
		double miles = userInput.nextDouble();
		
		//Calculate conversion
		kilometers = miles * 1.6;
		
		//Print conversion
		System.out.print(miles + " miles equals " + kilometers + " kilometers.");
	}
	
	static void kmToMi() {
		//Preparing for user input
		Scanner userInput = new Scanner(System.in);
		
		//Declaration
		double miles;
		
		//Prompt and record user input
		System.out.print("Enter number of kilometers: ");
		double kilometers = userInput.nextDouble();
		
		//Calculate conversion
		miles = kilometers / 1.6;
		
		//Print conversion
		System.out.print(kilometers + " kilometers equals " + miles + " miles.");
	}
	
	public static void main(String[] args) {
		//Preparing for user input
		Scanner userInput = new Scanner(System.in);
		
		//Prints available conversions
		System.out.println("1. Inches > Centimeters");
		System.out.println("2. Centimeters > Inches");
		System.out.println("3. Feet > Centimeters");
		System.out.println("4. Centimeters > Feet");
		System.out.println("5. Yards > Meters");
		System.out.println("6. Meters > Yards");
		System.out.println("7. Miles > Kilometers");
		System.out.println("8. Kilometers > Miles");
		
		//Prompt and record user input
		System.out.print("Enter a operator: ");
		int operator = userInput.nextInt();
		
		//Calls method corresponding to user input
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
