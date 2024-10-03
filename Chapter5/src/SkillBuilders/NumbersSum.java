/* Program: Evens.java          Last Date of this Revision: October 3, 2024

Purpose: An application that displays the even numbers between 1 and 20.

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
		
		int total = 0;
		int count = 1;
		
		while (count <= number) {
			System.out.println(count);
			total += count;
			count++;
		}

		System.out.println("Total: " + total);
	}

}
