package Mastery;

import java.util.Scanner;

public class EvensAndOdds2 {

public static void main(String[] args) {
		
		//Preparing for user input
		Scanner userInput = new Scanner(System.in);
		
		//Declare arrays
		int[] oddNum;
		int[] evenNum;
		
		//Allocate space in combinedNum array
		int count = 25;
		
		//Declare odd and even count
		int oddCount = 1;
		int evenCount = 1;
		
		oddNum = new int[oddCount];
		evenNum = new int[evenCount];
		
		
		for (int i = 0; i < count; i++) {
			int num = (int)((99 - 1 + 1) * Math.random() + 1);
			
			if (num  % 2 == 0) {
				evenNum[evenCount] = num;
				evenCount++;
			} else {
				oddNum[oddCount] = num;
				oddCount++;
			}
			
			
			
		}
		
		System.out.print("evenCount: " + evenCount);
		System.out.print("\noddCount: " + oddCount);
		
		
		
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
