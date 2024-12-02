package Mastery;

import java.util.Scanner;
import java.text.DecimalFormat;

public class TestLunchOrder {
	
	private static final DecimalFormat df = new DecimalFormat("0.00");
	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter number of hamburgers: ");
		int hamburgerAmount = userInput.nextInt();
		LunchOrder hamburger = new LunchOrder(1.85, 9, 33, 1);
		hamburger.Hamburger();
		
		System.out.print("\nEnter number of salads: ");
		int saladAmount = userInput.nextInt();
		LunchOrder salad = new LunchOrder(2.00, 1, 11, 5);
		salad.Salad();
		
		System.out.print("\nEnter number of fries: ");
		int frenchFryAmount = userInput.nextInt();
		LunchOrder frenchFries = new LunchOrder(1.30, 11, 36, 4);
		frenchFries.FrenchFries();
		
		System.out.print("\nEnter number of sodas: ");
		int sodaAmount = userInput.nextInt();
		LunchOrder soda = new LunchOrder(0.95, 0, 38, 0);
		soda.Soda();
		
		
		double total = (hamburgerAmount * hamburger.price) + (saladAmount * salad.price) + (frenchFryAmount * frenchFries.price) + (sodaAmount * soda.price);
		
		System.out.print("\nYour order comes to: $" + df.format(total));	
	}
	
}
