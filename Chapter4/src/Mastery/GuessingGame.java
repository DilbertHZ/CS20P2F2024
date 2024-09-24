/* Program: GuessingGame.java          Last Date of this Revision: September 24, 2024

Purpose: An application that generates a random number, which the user must guess

Author: Hunter Zahn, 
School: CHHS
Course: Computer Programming 20
*/

package Mastery;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		
		//Preparing for user input
		Scanner userInput = new Scanner(System.in);
		
		//Calculates both random numbers
		int num = (int)((20 - 1 + 1) * Math.random() + 1);
		
		//Prompt and record user input
		System.out.print("Enter a number between 1 and 20: ");
		int user = userInput.nextInt();
		
		System.out.println("Computer's Number: " + num);
		System.out.println("Player's Number: " + user);
		
		if (num == user) {
			System.out.print("You won!");
		}
		else {
			System.out.print("Better luck next time.");
		}
	}

}

/*Screen Dump

Test Case 1:
Enter a number between 1 and 20: 1
Computer's Number: 1
Player's Number: 1
You won!

Test Case 2:
Enter a number between 1 and 20: 5
Computer's Number: 13
Player's Number: 5
Better luck next time.

*/