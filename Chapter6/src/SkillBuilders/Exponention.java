/* Program: Exponention.java          Last Date of this Revision: October 20, 2024

Purpose: An application that exponentiates two numbers.

Author: Hunter Zahn, 
School: CHHS
Course: Computer Programming 20
*/

package SkillBuilders;

import java.util.Scanner;

public class Exponention {

	public static void powerOf(double firstNumber, double secondNumber) {
		
		//Declaration
		double power;
		
		//Calculates first number to the power of the second
		power = Math.pow(firstNumber, secondNumber);
		
		//Prints answer
		System.out.print(power);
		
	}
	
	public static void main(String[] args) {
		
		//Declaration
		double firstNumber, secondNumber;
				
		//Preparing for user input
		Scanner userInput = new Scanner(System.in);
				
		//Prompt and record user input
		System.out.print("Enter first number: ");
		firstNumber = userInput.nextDouble();
		System.out.print("Enter second number: ");
		secondNumber = userInput.nextDouble();

		//Calls powerOf method
		powerOf(firstNumber, secondNumber);
	}

}
