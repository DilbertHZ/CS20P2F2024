package Mastery;

import java.util.Scanner;

public class EvensAndOdds {
	
	
	
	
	public static void main(String[] args) {
		
		//Preparing for user input
		Scanner userInput = new Scanner(System.in);
		
		//Declare arrays
		int[] combinedNum;
		int[] oddNum;
		int[] evenNum;
		
		//Allocate space in combinedNum array
		int count = 25;
		combinedNum = new int[count];
		
		//Declare odd and even count
		int oddCount = 0;
		int evenCount = 0;
		
		//For loop assigns values to array, and initializes odd and even count 
		for (int i = 0; i < count; i++) {
			//Calculates random number
			int num = (int)((99 - 1 + 1) * Math.random() + 1);
			//Assigns random number to array
			combinedNum[i] = num;
			//Initializes odd and even count
			if (num  % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		
		System.out.print("evenCount: " + evenCount);
		System.out.print("\noddCount: " + oddCount);
		
		//Allocate space in oddNum and evenNum arrays
		oddNum = new int[oddCount];
		evenNum = new int[evenCount];
		
		for (int x = 0; x < count; x++) {
			if (x % 2 == 0) {
				evenNum[x] = combinedNum[x];
			} else {
				oddNum[x] = combinedNum[x];
			}
		}
		
		/*System.out.print("Evens: ");
		for (int element: evenNum) {
			System.out.print(element + " ");
		}
		System.out.print("\nOdds: ");
		for (int element: oddNum) {
			System.out.print(element + " ");
		}
		System.out.print("\nAll: ");
		for (int element: combinedNum) {
			System.out.print(element + " ");
		}*/
		
	}
	
}
