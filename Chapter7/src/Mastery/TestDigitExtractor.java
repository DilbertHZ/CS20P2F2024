/* Program: TestDigitExtractor.java          Last Date of this Revision: November 29, 2024

Purpose: An application that can record and display the ones, tens, hundreds, and total of a 3 digit integer.

Author: Hunter Zahn, 
School: CHHS
Course: Computer Programming 20
*/

package Mastery;

import java.util.Scanner;

public class TestDigitExtractor {

	//Object that returns user input
	public static int number() {
		@SuppressWarnings("resource")
		//Prepare for user input
		Scanner userInput = new Scanner(System.in);
		//Record user input
		int value = userInput.nextInt();
		//Returns user input
		return value;
	}
	
	public static String choice() {
		@SuppressWarnings("resource")
		//Prepare for user input
		Scanner userInput = new Scanner(System.in);
		//Record user input
		String choice = userInput.nextLine();
		//Returns user input
		return choice.toLowerCase();
	}
	
	public static void main(String[] args) {
		//Prompt user for input
		System.out.print("Enter an integer: ");
		int value = number();
		
		//Declares new variable input
		String input;
		input = " ";
		
		//Loops while input is not 0
		while (!input.equals("q")) { 
			
			//Prompt user for input
			System.out.println("Show (W)hole number.");
			System.out.println("Show (O)nes place number.");
			System.out.println("Show (T)ens place number");
			System.out.println("Show (H)undreds place number");
			System.out.println("(Q)uit.");
			System.out.print("Enter your choice: ");
			
			//Declares input variable as the return of the number() object
			input = choice();
			
			//Calls Num Object from DigitExtractor Class with the value and string input
			DigitExtractor.Num(value, input);
			
		}
		
	}
	
}