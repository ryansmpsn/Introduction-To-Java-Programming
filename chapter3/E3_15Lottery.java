package chapter3;
/*
 * Write a program to generate a lottery of a three-digit
 * number. The program prompts the user to enter a three-digit number and
 * determines whether the user wins.
 * 
 * Created by Ryan Simpson 9/19/2019
 */

import java.util.*;

public class E3_15Lottery {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int lottery = (int) (Math.random() * 1000);

		System.out.print("Enter your lottery pick (three digits): ");
		int guess = input.nextInt();

		// Get digits from lottery
		int lotteryDigit1 = lottery / 100;
		int lotteryDigit2 = lottery % 100 / 10;
		int lotteryDigit3 = lottery % 10;

		// Get digits from guess
		int guessDigit1 = lottery / 100;
		int guessDigit2 = lottery % 100 / 10;
		int guessDigit3 = lottery % 10;

		System.out.println("The lottery number is " + lottery);

		// Check the guess
		if (guess == lottery) {
			System.out.println("Exact match: you win $10,000");
		} else if (((guessDigit2 == lotteryDigit1) && (guessDigit1 == lotteryDigit2) && (guessDigit3 == lotteryDigit3))
				|| ((guessDigit1 == lotteryDigit1) && (guessDigit3 == lotteryDigit2) && (guessDigit2 == lotteryDigit3))
				|| ((guessDigit3 == lotteryDigit1) && (guessDigit1 == lotteryDigit2) && (guessDigit2 == lotteryDigit3))
				|| ((guessDigit2 == lotteryDigit1) && (guessDigit3 == lotteryDigit2) && (guessDigit1 == lotteryDigit3))
				|| ((guessDigit3 == lotteryDigit1) && (guessDigit2 == lotteryDigit2)
						&& (guessDigit1 == lotteryDigit3))) {
			System.out.println("Match all digits: you win $3,000");
		} else if ((guessDigit1 == lotteryDigit1) || (guessDigit1 == lotteryDigit2) || (guessDigit1 == lotteryDigit3)
				|| (guessDigit2 == lotteryDigit1) || (guessDigit2 == lotteryDigit2) || (guessDigit2 == lotteryDigit3)
				|| (guessDigit3 == lotteryDigit1) || (guessDigit3 == lotteryDigit2) || (guessDigit3 == lotteryDigit3)) {
			System.out.println("Match one digit: you win $1,000");
		} else {
			System.out.println("Sorry, no match");
		}
		
		input.close();
	}
}