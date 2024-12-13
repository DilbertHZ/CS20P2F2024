/* Program: CourseGrades.java          Last Date of this Revision: December 12, 2024

Purpose: An application that that takes 5 grades of 12 students, and calculates a either a student, or test average.

Author: Hunter Zahn, 
School: CHHS
Course: Computer Programming 20
*/

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
/* Screen Dump

Student 1:
Test 1: 54
Test 2: 84
Test 3: 65
Test 4: 75
Test 5: 32
Student 2:
Test 1: 45
Test 2: 85
Test 3: 58
Test 4: 45
Test 5: 68
Student 3:
Test 1: 57
Test 2: 62
Test 3: 15
Test 4: 86
Test 5: 23
Student 4:
Test 1: 58
Test 2: 95
Test 3: 75
Test 4: 81
Test 5: 68
Student 5:
Test 1: 24
Test 2: 52
Test 3: 35
Test 4: 14
Test 5: 75
Student 6:
Test 1: 84
Test 2: 65
Test 3: 95
Test 4: 32
Test 5: 75
Student 7:
Test 1: 45
Test 2: 85
Test 3: 65
Test 4: 23
Test 5: 15
Student 8:
Test 1: 45
Test 2: 85
Test 3: 95
Test 4: 75
Test 5: 955
Student 9:
Test 1: 100
Test 2: 45
Test 3: 85
Test 4: 75
Test 5: 25
Student 10:
Test 1: 36
Test 2: 54
Test 3: 68
Test 4: 79
Test 5: 58
Student 11:
Test 1: 64
Test 2: 75
Test 3: 94
Test 4: 85
Test 5: 41
Student 12:
Test 1: 25
Test 2: 12
Test 3: 65
Test 4: 78
Test 5: 25

Student 1:
Test 1: 54
Test 2: 84
Test 3: 65
Test 4: 75
Test 5: 32

Student 2:
Test 1: 45
Test 2: 85
Test 3: 58
Test 4: 45
Test 5: 68

Student 3:
Test 1: 57
Test 2: 62
Test 3: 15
Test 4: 86
Test 5: 23

Student 4:
Test 1: 58
Test 2: 95
Test 3: 75
Test 4: 81
Test 5: 68

Student 5:
Test 1: 24
Test 2: 52
Test 3: 35
Test 4: 14
Test 5: 75

Student 6:
Test 1: 84
Test 2: 65
Test 3: 95
Test 4: 32
Test 5: 75

Student 7:
Test 1: 45
Test 2: 85
Test 3: 65
Test 4: 23
Test 5: 15

Student 8:
Test 1: 45
Test 2: 85
Test 3: 95
Test 4: 75
Test 5: 955

Student 9:
Test 1: 100
Test 2: 45
Test 3: 85
Test 4: 75
Test 5: 25

Student 10:
Test 1: 36
Test 2: 54
Test 3: 68
Test 4: 79
Test 5: 58

Student 11:
Test 1: 64
Test 2: 75
Test 3: 94
Test 4: 85
Test 5: 41

Student 12:
Test 1: 25
Test 2: 12
Test 3: 65
Test 4: 78
Test 5: 25

What would you like to calculate?
1. Average of a student.
2. Average of a test.
3. Quit.
: 1

Student average for: 3
Average for student 3 is: 49

What would you like to calculate?
1. Average of a student.
2. Average of a test.
3. Quit.
: 2

Test average for: 4
Average for test 4 is: 62

What would you like to calculate?
1. Average of a student.
2. Average of a test.
3. Quit.
: 3

*/