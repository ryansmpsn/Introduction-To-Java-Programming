package chapter3;
/*
 * Write a program that plays the popular scissor-rock-paper game.
 * 
 * Created by Ryan Simpson 9/19/2019
 */

import java.util.*;

public class E3_17RockPaperScissors {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter Rock(0), Paper(1), or Scissors(2): ");
		int playerChoice = input.nextInt();
		input.close();

		int compChoice = (int) (Math.random() * 3);

		switch (playerChoice) {
		case 0:
			System.out.println("You are rock.");

			if (compChoice == 1) {
				System.out.println("The computer is paper. You Lose.");
			} else if (compChoice == 2) {
				System.out.println("The computer is scissors. You Win!");
			} else {
				System.out.println("Draw. You and the computer are rock.");
			}
			break;
		case 1:
			System.out.println("You are paper.");

			if (compChoice == 0) {
				System.out.println("The computer is rock. You Win!");
			} else if (compChoice == 3) {
				System.out.println("The computer is scissors. You Lose.");
			} else {
				System.out.println("Draw. You and the computer are paper.");
			}
			break;
		case 2:
			System.out.println("You are scissors.");

			if (compChoice == 0) {
				System.out.println("The computer is rock. You Lose!");
			} else if (compChoice == 1) {
				System.out.println("The computer is paper. You Win ");
			} else {
				System.out.println("Draw. You and the computer are scissors.");
			}
			break;
		}
	}
}
