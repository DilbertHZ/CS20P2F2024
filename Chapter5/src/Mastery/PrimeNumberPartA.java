/* Program: Evens.java          Last Date of this Revision: October 3, 2024

Purpose: An application that displays the even numbers between 1 and 20.

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

		boolean prime = false;
				
		for (int count=2; count <= (number - 1); count++) {
			if (number % count == 0) {	
				System.out.print("Number isn't prime");
				prime = false;
				break;
			} else {
				prime = true;
			}
		}
		
		if (prime == true || number == 2 || number == 1) {
			System.out.print("Number is prime");
		}
		
	}

}
