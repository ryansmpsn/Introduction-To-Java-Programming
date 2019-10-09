package chapter5;
/*
 * Write a program that prompts the user to enter the number
 * of students and each student’s name and score, and finally displays the name
 * of the student with the highest score.
 * 
 * Created by Ryan Simpson 10/2/2019
 */

import java.util.*;

public class E5_08HighestScore {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int studentNumber = input.nextInt();
		String s = "";
		int score = 0;

		for (int i = 0; i < studentNumber; i++) {

			System.out.println("Enter a students name: ");
			String newS = input.next();
			System.out.println("Enter their score: ");
			int newScore = input.nextInt();

			if (newScore > score) {
				s = newS;
				score = newScore;
			}
		}
		input.close();

		System.out.println("The student with the highest score is " + s + "wWith a score of " + score);
	}
}
