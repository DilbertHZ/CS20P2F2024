/* Program: GuessingGamePartA.java          Last Date of this Revision: October 7, 2024

Purpose: An application that generates a random number, which the user must guess with infinite attempts.

Author: Hunter Zahn, 
School: CHHS
Course: Computer Programming 20
*/

package Mastery;

import java.util.Scanner;

public class GuessingGamePartA {

	public static void main(String[] args) {
		
		//Declaration
		int user = 0;
		
		//Preparing for user input
		Scanner userInput = new Scanner(System.in);
				
		//Calculates random number
		int num = (int)((20 - 1 + 1) * Math.random() + 1);
				
		//Loops guess prompt while the guess doesn't equal the correct answer
		while (user != num) {
			//Prompt and record user input
			System.out.print("Enter a number between 1 and 20: ");
			user = userInput.nextInt();
			//Checks if they are the same number
			if (user == num) {
				//Prints win statement
				System.out.println("You won!");
			} else {
				//Prints incorrect statement
				System.out.println("Try again.");
			}
		}
				
	}

}

/*Screen Dump

Test Case 1:
Enter a number between 1 and 20: 1
Try again.
Enter a number between 1 and 20: 2
Try again.
Enter a number between 1 and 20: 3
You won!

*/