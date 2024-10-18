/* Program: TimeConverter.java          Last Date of this Revision: October 17, 2024

Purpose: An application that can convert days to hours, hours - minutes, and vice-versa.

Author: Hunter Zahn, 
School: CHHS
Course: Computer Programming 20
*/

package SkillBuilders;

import java.util.Scanner;

public class TimeConverter {

	public static void hoursToMinutes() {
		
		//Declaration
		int hours, minutes;
		
		
		//Preparing for user input
		Scanner userInput = new Scanner(System.in);
		
		//Prompt and record user input
		System.out.print("Enter number of hours: ");
		hours = userInput.nextInt();
		
		//Converting values
		minutes = hours * 60;
		
		//Output answer
		System.out.print(hours + " hours is equal to " + minutes + " minutes.");
		
	}
	
	public static void minutesToHours() {
		
		//Declaration
		int hours, minutes;
		
		//Preparing for user input
		Scanner userInput = new Scanner(System.in);
		
		//Prompt and record user input
		System.out.print("Enter number of minutes: ");
		minutes = userInput.nextInt();
		
		//Converting values
		hours = minutes / 60;
		
		//Output answer
		System.out.print(minutes + " minutes is equal to " + hours + " hours.");

	}
	
	public static void daysToHours() {
		
		//Declaration
		int hours, days;
		
		//Preparing for user input
		Scanner userInput = new Scanner(System.in);
		
		//Prompt and record user input
		System.out.print("Enter number of days: ");
		days = userInput.nextInt();
		
		//Converting values
		hours = days * 24;
		
		//Output answer
		System.out.print(days + " days is equal to " + hours + " hours.");

	}
	
	public static void hoursToDays() {
		
		//Declaration
		int hours, days;
		
		//Preparing for user input
		Scanner userInput = new Scanner(System.in);
		
		//Prompt and record user input
		System.out.print("Enter number of hours: ");
		hours = userInput.nextInt();
		
		//Converting values
		days = hours / 24;
		
		//Output answer
		System.out.print(hours + " hours is equal to " + days + " days.");

	}
	
	public static void main(String[] args) {
		      
		//Declaration
		int choice;
		
		//Preparing for user input
		Scanner userInput = new Scanner(System.in);
		
		//Prompts and record user input
		System.out.println("Select a conversion option from the provided below:");
		System.out.println("1. Hours -> Minutes");
		System.out.println("2. Minutes -> Hours");
		System.out.println("3. Days -> Hours");
		System.out.println("4. Hours -> Days");
		System.out.print(": ");
		choice = userInput.nextInt();
		
		//Calls applicable method depending on inputed choice
		if (choice == 1) {
			hoursToMinutes();
		} else if (choice == 2) {
			minutesToHours();
		} else if (choice == 3) {
			daysToHours();
		} else if (choice == 4) {
			hoursToDays();
		} else {
			System.out.println("Invalid option.");
		}
	}

}
