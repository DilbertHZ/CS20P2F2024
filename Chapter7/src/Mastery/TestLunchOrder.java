/* Program: TestLunchOrder.java          Last Date of this Revision: November 29, 2024

Purpose: An application that displays the nutritional information about available foods, and totals the price depending on the number of dishes ordered.

Author: Hunter Zahn, 
School: CHHS
Course: Computer Programming 20
*/

package Mastery;

import java.util.Scanner;
import java.text.DecimalFormat;

public class TestLunchOrder {
	
	//Decimal format, to round to 2 decimals
	private static final DecimalFormat df = new DecimalFormat("0.00");
	
	public static void main(String[] args) {
		
		//Preparing for user input
		Scanner userInput = new Scanner(System.in);
		
		//Prompt user input
		System.out.print("Enter number of hamburgers: ");
		//Record user input
		int hamburgerAmount = userInput.nextInt();
		//Creates hamburger object with assigned attributes
		LunchOrder hamburger = new LunchOrder(1.85, 9, 33, 1);
		//Calls hamburger object with Hamburger attributes
		hamburger.Hamburger();
		
		//Prompt user input
		System.out.print("\nEnter number of salads: ");
		//Record user input
		int saladAmount = userInput.nextInt();
		//Creates salad object with assigned attributes
		LunchOrder salad = new LunchOrder(2.00, 1, 11, 5);
		//Calls salad object with Salad attributes
		salad.Salad();
		
		//Prompt user input
		System.out.print("\nEnter number of fries: ");
		//Record user input
		int frenchFryAmount = userInput.nextInt();
		//Creates frenchFries object with assigned attributes
		LunchOrder frenchFries = new LunchOrder(1.30, 11, 36, 4);
		//Calls frenchFries object with FrenchFries attributes
		frenchFries.FrenchFries();
		
		//Prompt user input
		System.out.print("\nEnter number of sodas: ");
		//Record user input
		int sodaAmount = userInput.nextInt();
		//Creates soda object with assigned attributes
		LunchOrder soda = new LunchOrder(0.95, 0, 38, 0);
		//Calls soda object with Soda attributes
		soda.Soda();
		
		
		
		
		double total = (hamburgerAmount * hamburger.price) + (saladAmount * salad.price) + (frenchFryAmount * frenchFries.price) + (sodaAmount * soda.price);
		
		System.out.print("\nYour order comes to: $" + df.format(total));	
	}
	
}
