/* Program: PrimeNumberPartA.java          Last Date of this Revision: October 7, 2024

Purpose: An application that checks and displays if a number is prime or not.

Author: Hunter Zahn, 
School: CHHS
Course: Computer Programming 20
*/

package Mastery;

import java.util.Scanner;

public class PrimeNumberPartA {

	public static void main(String[] args) {
		
		//Preparing for user input
		Scanner userInput = new Scanner(System.in);

		//Prompt and record the user for
		System.out.print("Enter an integer value: ");
		int number = userInput.nextInt();

		//Declaration
		boolean prime = true;
		
		//Loops an if else statement and increments count by 1 while the
		//count is less than or equal to 2 less than the inputed number
		for (int count=2; count <= (number - 2); count++) {
			//Checks if the modulo of the number is zero
			if (number % count == 0) {	
				//Declares the number as not prime and breaks loop
				prime = false;
				break;
			}
		}
		
		//Checks if the number is prime or is 1
		if (prime == false || number == 1) {
			//Prints according statement
			System.out.print("Number isn't prime");
		} else {
			System.out.print("Number is prime");
		}
		
		
	}

}

/*Screen Dump

Test Case 1:
Enter an integer value: 9
Number isn't prime

Test Case 2:
Enter an integer value: 7
Number is prime

*/