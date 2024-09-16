package Mastery;

import java.util.Scanner;

public class ProjectMastery {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Designing: ");
		int design = userInput.nextInt();
		
		System.out.print("Coding: ");
		int code = userInput.nextInt();
		
		System.out.print("Debugging: ");
		int debug = userInput.nextInt();
		
		System.out.print("Testing: ");
		int test = userInput.nextInt();
		
		double designprcnt = ( (double) design / (design + code + debug + test)) * 100;
		double codeprcnt = ( (double) code / (design + code + debug + test)) * 100;	
		double debugprcnt = ( (double) debug / (design + code + debug + test)) * 100;	
		double testprcnt = ( (double) test / (design + code + debug + test)) * 100;

		System.out.println("Task     % Time");
		System.out.println("Designing" + designprcnt);
		System.out.println("Coding" + codeprcnt);
		System.out.println("Debugging" + debugprcnt);
		System.out.print("Testing" + testprcnt);
	}

}
