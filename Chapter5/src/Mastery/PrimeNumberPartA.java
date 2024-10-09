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

		boolean prime = true;
		
		for (int count=2; count <= (number - 1); count++) {
			if (number % count == 0) {	
				prime = false;
				break;
			} else if (number == 2){
				prime = true;
				break;
			}
		}
		
		if (prime == false || number == 1) {
			System.out.print("Number isn't prime");
		} else if (prime == true) {
			System.out.print("Number is prime");
		}
		
		
	}

}
