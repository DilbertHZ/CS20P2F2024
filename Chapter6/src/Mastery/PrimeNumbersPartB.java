package Mastery;

import java.util.Scanner;

public class PrimeNumbersPartB {

	public boolean isPrime(int number, int count) {
				
			if (number % count == 0) {	
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		//Preparing for user input
		Scanner userInput = new Scanner(System.in);

		//Prompt and record the user for
		System.out.print("Enter an integer value: ");
		int number = userInput.nextInt();

		for (int count=2; count <= (number - 1); count++) {
			isPrime();
		
	}

}
