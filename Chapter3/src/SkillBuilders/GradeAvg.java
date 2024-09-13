package SkillBuilders;

import java.util.*;

public class GradeAvg {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		int totalgrade = 0;
		
		System.out.print("Current grade total: " + totalgrade + " Enter grade 1: ");
		int grade1 = userInput.nextInt();
		totalgrade += grade1;
		
		System.out.print("Current grade total: " + totalgrade + " Enter grade 2: ");
		int grade2 = userInput.nextInt();
		totalgrade += grade2;
		
		System.out.print("Current grade total: " + totalgrade + " Enter grade 3: ");
		int grade3 = userInput.nextInt();
		totalgrade += grade3;
		
		System.out.print("Current grade total: " + totalgrade + " Enter grade 4: ");
		int grade4 = userInput.nextInt();
		totalgrade += grade4;
		
		System.out.print("Current grade total: " + totalgrade + " Enter grade 5: ");
		int grade5 = userInput.nextInt();
		totalgrade += grade5;
		
		double avg = (((double) grade1 + grade2 + grade3 + grade4 + grade5) / 5);
		
		System.out.print("Current grade total: " + totalgrade + " Your average is: " + avg + "%");
	}
	

}
