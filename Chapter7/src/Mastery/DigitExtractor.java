package Mastery;

public class DigitExtractor {

	public static void Num(int number, String choice) {
		
		int hundreds = number / 100;
		
		int tens = number / 10 % 10;
		
		int ones = number % 10;
		
		if (choice.equals("w")) {
			System.out.println("The number is: " + number);
		} else if (choice.equals("h")) {
			System.out.println("The hundreds place digit is: " + hundreds);
		} else if (choice.equals("t")) {
			System.out.println("The tens place digit is: " + tens);
		} else if (choice.equals("o")) {
			System.out.println("The ones place digit is: " + ones);
		}
	}
	
}