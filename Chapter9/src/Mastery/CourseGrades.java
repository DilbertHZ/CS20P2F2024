package Mastery;

import java.lang.Math;
import java.util.Scanner;

public class CourseGrades {
	
	private static int[][] grades;
	
	private static void getGrades() {
		//Preparing for user input
		Scanner userInput = new Scanner(System.in);
		
		for (int student = 0; student < 12; student++) {
			System.out.println("Student " + (student + 1) + ":");
			for (int course = 0; course < 5; course++) {
				System.out.print("Test " + (course + 1) + ": ");
				grades[student][course] = userInput.nextInt();
			}
		}
	}
	
	private static void showGrades() {
		for (int student = 0; student < 12; student++) {
			System.out.println("\nStudent " + (student + 1) + ":");
			for (int course = 0; course < 5; course++) {
				System.out.println("Test " + (course + 1) + ": " + grades[student][course]);
			}
		}
	}
	
	private static int studentAvg(int studentNum) {
		int averageStudent = 0;
		
		for (int course = 0; course < 5; course++) {
			averageStudent += grades[studentNum - 1][course];
		}
		
		averageStudent =   (int) Math.round((double) averageStudent / 5);
		
		return averageStudent;
	}
	
	private static int testAvg(int testNum) {
		int averageTest = 0;
		
		for (int student = 0; student < 12; student++) {
			averageTest += grades[student][testNum - 1];
		}
		
		averageTest = (int) Math.round((double) averageTest / 12);
		
		return averageTest;
	}
	
	

	public static void main(String[] args) {
		
		//Preparing for user input
		Scanner userInput = new Scanner(System.in);
		
		grades = new int[12][5];
		
		getGrades();
		showGrades();
		
		int choice = 0;
		
		while (choice != 3) {
			System.out.println("\nWhat would you like to calculate?");
			System.out.println("1. Average of a student.");
			System.out.println("2. Average of a test.");
			System.out.print("3. Quit.\n: ");
			choice = userInput.nextInt();
			
			if (choice == 1) {
				System.out.print("\nStudent average for: ");
				int studentNum = userInput.nextInt();
				System.out.println("Average for student " + studentNum + " is: " + studentAvg(studentNum));
			} else if (choice == 2) {
				System.out.print("\nTest average for: ");
				int testNum = userInput.nextInt();
				System.out.println("Average for test " + testNum + " is: " + testAvg(testNum));
			}
			
		}
	
	}

}
