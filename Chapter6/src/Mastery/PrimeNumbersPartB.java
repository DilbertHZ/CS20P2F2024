package Mastery;

import java.util.Scanner;

public class PrimeNumbersPartB {

	public static boolean isPrime(double number, double count) {
				
			if (number % count == 0) {	
				return false;
			}
			else {
				return true;
			}
	}
	
	public static void main(String[] args) {
		
		//Preparing for user input
		Scanner userInput = new Scanner(System.in);

		//Prompt and record the user for
		System.out.print("Enter an integer value: ");
		double number = userInput.nextInt();

		double count= 2;
		
		while(count <= (number - 1)) {
			System.out.print(isPrime(number, count));
			count++;
		}
		if (isPrime(number, count)) {
			System.out.print("Is prime");
		} else {
			System.out.print("Isn't prime");
		}
	
	}
	
}
