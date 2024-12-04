/* Program: TestMySavings.java          Last Date of this Revision: November 29, 2024

Purpose: An application that can add, remove, and display the amount of money in a piggybank.

Author: Hunter Zahn, 
School: CHHS
Course: Computer Programming 20
*/

package Mastery;

import java.util.Scanner;

public class TestMySavings {
	
	//Object that returns user input
	public static int selection() {
		@SuppressWarnings("resource")
		//Prepare for user input
		Scanner userInput = new Scanner(System.in);
		//Record user input
		int choice = userInput.nextInt();
		//Returns user input
		return choice;
	}

	public static void main(String[] args) {

		//Declares input variable
		int input;
		
		//Loops while input is not 0
		 do { 
			//Prompt user for input
			System.out.println("1. Show total in bank.");
			System.out.println("2. Add a penny.");
			System.out.println("3. Add a nickel.");
			System.out.println("4. Add a dime.");
			System.out.println("5. Add a quarter.");
			System.out.println("6. Take money out of bank.");
			System.out.println("Enter 0 to quit.");
			System.out.println("Enter your choice: ");
			
			//Declares input variable as selection() object
			input = selection();
			
			//Calls PiggyBank Object from MySavings Class with the input variable
			MySavings.PiggyBank(input);
		
		} while (input != 0);
		
	}
		
}
