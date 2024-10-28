/* Program: NumbersSum.java          Last Date of this Revision: October 4, 2024

Purpose: An application that displays sum of every incrementing integer up to an inputed integer

Author: Hunter Zahn, 
School: CHHS
Course: Computer Programming 20
*/

package SkillBuilders;

import java.util.Scanner;

public class NumbersSum {

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
			//Prints the current count
			System.out.println(count);
			//Adds the current count to the total
			total += count;
			//Increments by one
			count++;
		}

		//Prints the total
		System.out.println("Total: " + total);
	}

}
