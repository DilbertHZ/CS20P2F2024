/* Program: Evens.java          Last Date of this Revision: October 3, 2024

Purpose: An application that displays the even numbers between 1 and 20.

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
			
		int total = 0;
		int count = 1;
			
		while (count <= number) {
			if (count % 2 != 0) {
				System.out.println(count);
				total += count;
				count+=2;
			} else {
				count+=2;
			}
			
		}

		System.out.println("Total: " + total);

	}

}
