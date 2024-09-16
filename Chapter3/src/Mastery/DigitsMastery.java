package Mastery;

import java.util.Scanner;

public class DigitsMastery {

	public static void main(String[] args) {
		
			
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter a 3 digit number: ");
		int number = userInput.nextInt();
		
		int hundreds = number / 100;
		
		int tens = number / 10 % 10;
		
		int ones = number % 10;
		
		System.out.println("Hundreds: " + hundreds);
		System.out.println("Tens: " + tens);
		System.out.print("Ones: " + ones);

	}

}