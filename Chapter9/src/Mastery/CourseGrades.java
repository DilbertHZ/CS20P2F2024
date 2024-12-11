package Mastery;

import java.util.Scanner;

public class CourseGrades {
	
	private static int[][] grades;
	
	private static void getGrades() {
		//Preparing for user input
		Scanner userInput = new Scanner(System.in);
		
		for (int count = 0; count <= 12; count ++) {
			System.out.print("Student " + count);
			grades[][] = userInput.nextInt();
		}
	}

	public static void main(String[] args) {
		
		//Preparing for user input
		Scanner userInput = new Scanner(System.in);
		
		grades = new int[12][5];

	}

}
