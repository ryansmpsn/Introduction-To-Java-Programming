package chapter5;
/*
 * Write a program that prompts the user to enter the number
 * of students and each student’s name and score, and finally displays the name
 * of the students with the two highest scores.
 * 
 * Created by Ryan Simpson 10/2/2019
 */

import java.util.*;

public class E5_09TwoHighestScores {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int studentNumber = input.nextInt();
		String s1 = "";
		String s2 = "";
		int highestScore = 0;
		int secondHighest = 0;

		for (int i = 0; i < studentNumber; i++) {

			System.out.println("Enter a students name: ");
			String newS = input.next();
			System.out.println("Enter their score: ");
			int newScore = input.nextInt();

			if (newScore > highestScore) {
				s1 = newS;
				highestScore = newScore;
			}
			if (newScore > secondHighest && newScore < highestScore) {
				s2 = newS;
				secondHighest = newScore;
			}
		}
		
		input.close();

		System.out.println("The student with the highest score is " + s1 + " with a score of " + highestScore);
		System.out.println("The student with the second highest score is " + s2 + " with a score of " + secondHighest);

	}
}