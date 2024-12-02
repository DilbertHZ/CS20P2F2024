/* Program: DigitExtractor.java          Last Date of this Revision: November 29, 2024

Purpose: An application that can record and display the ones, tens, hundreds, and total of a 3 digit integer.

Author: Hunter Zahn, 
School: CHHS
Course: Computer Programming 20
*/

package Mastery;

public class DigitExtractor {

	public static void Num(int number, String choice) {
		
		//Declares hundreds digit
		int hundreds = number / 100;
		
		//Declares tens digit
		int tens = number / 10 % 10;
		
		//Declares ones digit
		int ones = number % 10;
		
		//If else if depending on user input
		if (choice.equals("w")) {
			//Prints entire number
			System.out.println("The number is: " + number);
			
		} else if (choice.equals("h")) {
			//Prints hundreds place
			System.out.println("The hundreds place digit is: " + hundreds);
			
		} else if (choice.equals("t")) {
			//Prints tens place
			System.out.println("The tens place digit is: " + tens);
			
		} else if (choice.equals("o")) {
			//Prints ones place
			System.out.println("The ones place digit is: " + ones);
		}
	}
	
}