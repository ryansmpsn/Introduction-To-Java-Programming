package chapter4;
/*
 * Write a program that prompts the user to enter a
 * letter grade A, B, C, D, or F and displays its corresponding numeric value 4, 3, 2, 1, or 0.
 * 
 * Created by Ryan Simpson 9/24/2019
 */

import java.util.*;

public class E4_14LetterGradeToNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a letter grade: ");
		String s = input.next();
		char grade = s.charAt(0);
		input.close();

		if (Character.isLetter(grade)) {

			switch (Character.toUpperCase(grade)) {
			case 'A':
				System.out.println("The numeric value for grade " + grade + " is 4.");
				break;
			case 'B':
				System.out.println("The numeric value for grade " + grade + " is 3.");
				break;
			case 'C':
				System.out.println("The numeric value for grade " + grade + " is 2.");
				break;
			case 'D':
				System.out.println("The numeric value for grade " + grade + " is 1.");
				break;
			case 'F':
				System.out.println("The numeric value for grade " + grade + " is 0.");
				break;
			}
		} else
			System.out.println(grade + " is an invalid grade.");
	}

}
