package SkillBuilders;

import java.util.*;

public class Digits {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter a 2 digit number: ");
		int number = userInput.nextInt();
		
		int tens = number / 10;
		
		int ones = number % 10;
		
		System.out.print("Tens; " + tens + " Ones: " + ones);
		
		
	}

}