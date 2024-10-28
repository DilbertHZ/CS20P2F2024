/* Program: OddSum.java          Last Date of this Revision: October 4, 2024

Purpose: An application that displays sum of every incrementing odd integer up to an inputed integer

Author: Hunter Zahn, 
School: CHHS
Course: Computer Programming 20
*/

package SkillBuilders;

import java.util.Scanner;

public class OddSum {

	public static void main(String[] args) {
		
		//Preparing for user input
		Scanner userInput = new Scanner(System.in);

		//Prompt and record the user for
		System.out.print("Enter an integer value: ");
		int number = userInput.nextInt();
			
		//Declaration
		int total = 0;
		int count = 1;
			
		//Loops while the count is less than or equal to the number
		while (count <= number) {
			//Checks if the count isn't even
			if (count % 2 != 0) {
				//Prints the current count
				System.out.println(count);
				//Adds the current count to the total
				total += count;
				//Increments by two
				count+=2;
			} else {
				//Increments by two
				count+=2;
			}
			
		}

		//Prints the total
		System.out.println("Total: " + total);

	}

}
